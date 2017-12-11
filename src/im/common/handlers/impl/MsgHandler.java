package im.common.handlers.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import entity.TextMessage;
import im.common.IMPacket;
import im.common.handlers.BaseHandler;
import im.common.protof.ResponseModel;
import im.common.util.ResponseCode;
import im.common.util.annotation.IMResponse;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import org.tio.core.ChannelContext;
import sample.util.MsgContent;
import sample.util.MsgContentUtil;

/**
 * Created by 马东 on 2017/12/10.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 22:27 2017/12/10
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
@IMResponse(responseCode = ResponseCode.RES_SENDMSG)
//@IMInterceptor
public class MsgHandler implements BaseHandler {
    @Override
    public String init(ResponseModel.ImResponse imResponse, ChannelContext<Object, IMPacket, Object> channelContext, Object ocompent) {
        final String result  = imResponse.getObjectJson();
        JSONObject object = JSON.parseObject(result);
        String msgType = object.getString("msgType");
        if("TEXT".equals(msgType)){
            final TextMessage textMessage = JSON.parseObject(result,TextMessage.class);
            Platform.runLater(new Runnable() {
                public void run() {
                    ObservableList<MsgContent> msgContents = MsgContentUtil.getDataMap(textMessage.getSender());
                    MsgContent msgContent = new MsgContent();
                    msgContent.setMsgType(textMessage.getMsgType());
                    msgContent.setContent(textMessage.getMsg());
                    msgContent.setSender(textMessage.getSender());
                    msgContent.setSendTime(textMessage.getSendTime());
                    msgContent.setPaint(Color.RED);

                    msgContents.add(msgContent);
                }
            });

        }
//// // TODO: 2017/12/10 没有控制相同的多个tab,系统断线重连问题没有将channel 装到list
        return null;
    }
}
