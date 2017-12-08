package im.common.interceptor.impl;


import com.jfinal.log.Log;
import im.common.IMPacket;
import im.common.interceptor.BaseInterceptor;
import org.tio.core.ChannelContext;

/**
 * Created by 马东 on 2017/8/23.
 */
public class GeneralInterceptor implements BaseInterceptor {
    private static final Log log = Log.getLog(GeneralInterceptor.class);
    private Object ocompent = null;
    private String result = "";
    @Override
    public Object before(ChannelContext<Object, IMPacket, Object> channelContext) {
        log.info("---wozai--before--");
        System.out.println("---wozai--before--");
        return ocompent;
    }
    public void setOcompent(Object ocompent){
        this.ocompent = ocompent;
    }
    @Override
    public void after(ChannelContext<Object, IMPacket, Object> channelContext,String resultStr) {
        log.info("---wozai--after--");
        System.out.println("---wozai--after--"+resultStr);
        result = resultStr;
    }
    public String getResult(){
        return result;
    }
}
