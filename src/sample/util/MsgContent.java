package sample.util;

/**
 * Created by 马东 on 2017/11/7.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 19:25 2017/11/7
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class MsgContent {
    private String sender;
    private String msgType;
    private String content;//信息内容

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
