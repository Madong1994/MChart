package im;


//import com.base.utils.GZipUtil;

import im.common.DispatcherHandler;
import im.common.IMAbsAioHandler;
import im.common.IMPacket;
import im.common.protof.ResponseModel;
import org.tio.client.intf.ClientAioHandler;
import org.tio.core.ChannelContext;

public class IMClientAioHandler extends IMAbsAioHandler implements ClientAioHandler<Object, IMPacket, Object>
{
	/** 
	 * 处理消息
	 */
	@Override
	public Object handler(IMPacket packet, ChannelContext<Object, IMPacket, Object> channelContext) throws Exception
	{
		byte[] body = packet.getBody();
		if (body != null)
		{
			ResponseModel.ImResponse imResponse = ResponseModel.ImResponse.parseFrom(body);
//			if (imRequest.getHandler() == HandlerCode.REQUEST) {
//			registInterceptor(imRequest);
			DispatcherHandler.handler(imResponse, channelContext);
		}

		return null;

	}

	private static IMPacket heartbeatPacket = new IMPacket();

	/** 
	 * 此方法如果返回null，框架层面则不会发心跳；如果返回非null，框架层面会定时发本方法返回的消息包
	 */
	@Override
	public IMPacket heartbeatPacket()
	{
		return heartbeatPacket;
	}
}
