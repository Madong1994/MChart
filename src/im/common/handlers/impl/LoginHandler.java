package im.common.handlers.impl;

import com.alibaba.fastjson.JSON;
import entity.User;
import im.common.IMPacket;
import im.common.handlers.BaseHandler;
import im.common.interceptor.impl.GeneralInterceptor;
import im.common.protof.RequestModel;
import im.common.protof.ResponseModel;
import im.common.util.HandlerCode;
import im.common.util.RequestCode;
import im.common.util.ResponseCode;
import im.common.util.annotation.IMInterceptor;
import im.common.util.annotation.IMResponse;
import im.common.util.tool.*;
import javafx.application.Platform;
import javafx.scene.text.Text;
import org.tio.core.ChannelContext;
import sample.StageController;
import sample.compoment.MWindow;
import sample.controller.LoginController;
import sample.util.Me;
import sample.util.Stages;

/**
 * Created by 马东 on 2017/10/12.
 */
@IMResponse(responseCode = ResponseCode.RES_LOGIN)
@IMInterceptor
public class LoginHandler implements BaseHandler {
    @Override
    public String init(ResponseModel.ImResponse imResponse, ChannelContext<Object, IMPacket, Object> channelContext, final Object ocompent) {
        final String result  = imResponse.getObjectJson();
        final LoginController controller = (LoginController) ocompent;
//        final ResultMsg resultMsg = ResultMsg.toResultMsg(result);
        final ResultMsg resultMsg = JSON.parseObject(result,ResultMsg.class);
        if(resultMsg.getResultCode() == ResultMsgCode.LOGIN_SCUSSE){
            final StageController stageController = controller.getStageController();
            System.out.println("==="+resultMsg.getObject());
            String userJson = resultMsg.getObject();
            User user = JSON.parseObject(userJson,User.class);
            Me.USER_NUM = user.getUserNum();
            Me.USER_NAME = user.getUserName();

            Platform.runLater(new Runnable() {
                public void run() {
                    stageController.setStage(Stages.mwindow,Stages.loginViewID);
                }
            });
            /*获得好友列表*/
            RequestModel.ImRequest imRequest = ProtoBufUtil.requestModelFactory(RequestCode.GET_FRENDS, HandlerCode.REQUEST,"0","0", DateUtil.getDate(),user.getUserNum());
            MWindow mWindow = (MWindow) stageController.getPane(Stages.mwindow);
            GeneralInterceptor generalInterceptor = new GeneralInterceptor();
            generalInterceptor.setOcompent(mWindow);
            IMSend.send(imRequest,generalInterceptor);
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
