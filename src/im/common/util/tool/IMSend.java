package im.common.util.tool;

import im.IMClientStarter;
import im.common.IMPacket;
import im.common.protof.RequestModel;
import org.tio.core.Aio;

/**
 * Created by 马东 on 2017/9/23.
 */
public class IMSend {
    public static void send(RequestModel.ImRequest imRequest){
        IMPacket imPacket = new IMPacket();
        byte[] msg = imRequest.toByteArray();
        imPacket.setBody(msg);
        Aio.send(IMClientStarter.clientChannelContext,imPacket);
    }
}
