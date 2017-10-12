package im.common.handlers.impl;

import im.common.IMPacket;
import im.common.handlers.BaseHandleImpl;
import im.common.protof.ResponseModel;
import im.common.util.ResponseCode;
import im.common.util.annotation.IMResponse;
import org.tio.core.ChannelContext;

/**
 * Created by 马东 on 2017/10/12.
 */
@IMResponse(responseCode = ResponseCode.RES_LOGIN)
public class LoginHandler extends BaseHandleImpl {
    @Override
    public String init(ResponseModel.ImResponse imResponse, ChannelContext<Object, IMPacket, Object> channelContext) {
        String result  = imResponse.getObjectJson();
        return null;
    }
}
