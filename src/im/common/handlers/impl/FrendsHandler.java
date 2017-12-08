package im.common.handlers.impl;

import com.alibaba.fastjson.JSON;
import entity.User;
import im.common.IMPacket;
import im.common.handlers.BaseHandler;
import im.common.protof.ResponseModel;
import im.common.util.ResponseCode;
import im.common.util.annotation.IMInterceptor;
import im.common.util.annotation.IMResponse;
import im.common.util.tool.ResultMsg;
import javafx.application.Platform;
import org.tio.core.ChannelContext;
import sample.compoment.MWindow;

import java.util.List;

/**
 * Created by 马东 on 2017/12/8.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 22:13 2017/12/8
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
@IMResponse(responseCode = ResponseCode.FRENDS)
@IMInterceptor
public class FrendsHandler implements BaseHandler {
    @Override
    public String init(ResponseModel.ImResponse imResponse, ChannelContext<Object, IMPacket, Object> channelContext, Object ocompent) {
        String result  = imResponse.getObjectJson();
        final ResultMsg resultMsg = JSON.parseObject(result,ResultMsg.class);
        String objJson = resultMsg.getObject();
        final List<User> users = JSON.parseArray(objJson,User.class);
        final MWindow mWindow = (MWindow) ocompent;
        Platform.runLater(new Runnable() {
            public void run() {
                mWindow.addFriends(users);
            }
        });

        return null;
    }
}
