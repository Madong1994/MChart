package im.common.util.tool;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class ResultMsg {
    private int resultCode;
    private String resultMsg;
    private String object;

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public static ResultMsg toResultMsg(String msgJson,Object obj){
        JSONObject object = JSON.parseObject(msgJson);
        int resultCode = object.getInteger("resultCode");
        String resultMsg = object.getString("resultMsg");
        ResultMsg resultMsgObj = new ResultMsg();
        resultMsgObj.setResultCode(resultCode);
        resultMsgObj.setResultMsg(resultMsg);
        return resultMsgObj;
    }
}
