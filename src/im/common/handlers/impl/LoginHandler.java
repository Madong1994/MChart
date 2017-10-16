package im.common.handlers.impl;

import im.common.IMPacket;
import im.common.handlers.BaseHandler;
import im.common.protof.ResponseModel;
import im.common.util.ResponseCode;
import im.common.util.annotation.IMInterceptor;
import im.common.util.annotation.IMResponse;
import im.common.util.tool.ResultMsg;
import im.common.util.tool.ResultMsgCode;
import javafx.application.Platform;
import javafx.scene.text.Text;
import org.tio.core.ChannelContext;
import sample.Controller;

/**
 * Created by 马东 on 2017/10/12.
 */
@IMResponse(responseCode = ResponseCode.RES_LOGIN)
@IMInterceptor
public class LoginHandler implements BaseHandler {
    @Override
    public String init(ResponseModel.ImResponse imResponse, ChannelContext<Object, IMPacket, Object> channelContext, final Object ocompent) {
        final String result  = imResponse.getObjectJson();
        final Controller controller = (Controller) ocompent;
        final ResultMsg resultMsg = ResultMsg.toResultMsg(result);
        if(resultMsg.getResultCode() == ResultMsgCode.LOGIN_SCUSSE){

        }else {
            Platform.runLater(new Runnable() {
                public void run() {
                    Text text = controller.getActionTaget();
                    text.setText(resultMsg.getResultMsg());
                }
            });
        }

        return result;
    }
}
