package im.common.interceptor.impl;


import com.jfinal.log.Log;
import im.common.IMPacket;
import im.common.interceptor.BaseInterceptor;
import org.tio.core.ChannelContext;

/**
 * Created by 马东 on 2017/8/23.
 */
public class LoginInterceptor implements BaseInterceptor {
    private static final Log log = Log.getLog(LoginInterceptor.class);
    @Override
    public void before(ChannelContext<Object, IMPacket, Object> channelContext) {
        log.info("---wozai--before--");
        System.out.println("---wozai--before--");
    }

    @Override
    public void after(ChannelContext<Object, IMPacket, Object> channelContext) {
        log.info("---wozai--after--");
        System.out.println("---wozai--after--");
    }
}
