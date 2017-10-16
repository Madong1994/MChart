package im.common.util.tool;

import im.IMClientStarter;
import im.common.DispatcherHandler;
import im.common.IMPacket;
import im.common.interceptor.BaseInterceptor;
import im.common.protof.RequestModel;
import org.tio.core.Aio;

/**
 * Created by 马东 on 2017/9/23.
 */
public class IMSend {
    public static void send(RequestModel.ImRequest imRequest, BaseInterceptor interceptor){
        IMPacket imPacket = new IMPacket();
        byte[] msg = imRequest.toByteArray();
        imPacket.setBody(msg);

        /**  注册拦截器 **/
        if(interceptor != null){
            DispatcherHandler.b_interceptor = interceptor;
        }
        Aio.send(IMClientStarter.clientChannelContext,imPacket);

    }
}
