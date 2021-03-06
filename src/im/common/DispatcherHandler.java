package im.common;


import com.jfinal.log.Log;
import im.common.handlers.BaseHandler;
import im.common.interceptor.BaseInterceptor;
import im.common.interceptor.HandlerInterceptor;
import im.common.protof.ResponseModel;
import im.common.util.annotation.IMInterceptor;
import im.common.util.annotation.IMResponse;
import im.common.util.tool.ClassScaner;
import org.tio.core.ChannelContext;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: DispatcherHandler.class
 * @包名: com.base.im.common
 * @描述: 通过@IMRequst注解寻找处理类
 * @所属: 华夏九鼎
 * @日期: 2017/8/16 14:51
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
public class DispatcherHandler {
    public static BaseInterceptor b_interceptor;//拦截器逻辑接口
    private static final Log log = Log.getLog(DispatcherHandler.class);

    private static List<Class<BaseHandler>> BaseHandleImplClassList = ClassScaner.scanSubClass(BaseHandler.class);

    public static String handler(ResponseModel.ImResponse imResponse, ChannelContext<Object, IMPacket, Object> channelContext) {
        if (BaseHandleImplClassList != null) {
            for (Class<?> impl : BaseHandleImplClassList) {
                IMResponse annotation = impl.getAnnotation(IMResponse.class);
                IMInterceptor interceptor = impl.getAnnotation(IMInterceptor.class);
                if (null != annotation && annotation.responseCode() == imResponse.getCode()) {
                    try {
                        if(interceptor != null){
                            //使用注解拦截器
                            BaseHandler baseHandle = (BaseHandler) impl.newInstance();
                            interThrows();
                            HandlerInterceptor handlerInterceptor = new HandlerInterceptor(baseHandle,b_interceptor);
                            BaseHandler baseHandle1 = (BaseHandler) Proxy.newProxyInstance(handlerInterceptor.getClass().getClassLoader(),baseHandle.getClass().getInterfaces(),handlerInterceptor);
                            return baseHandle1.init(imResponse, channelContext,null);
                        }else {
                            //没有使用拦截器
                            Method method = impl.getMethod("init", ResponseModel.ImResponse.class, ChannelContext.class,Object.class);
                            Object object = impl.newInstance();
                            return (String) method.invoke(object, imResponse, channelContext,null);
                        }

                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                        log.error(e.getMessage());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        log.error(e.getMessage());
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                        log.error(e.getMessage());
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                        log.error(e.getMessage());
                    } catch (Exception e) {
                        e.printStackTrace();
                        log.error(e.getMessage());
                    }
                }
            }
        }
        return null;
    }
    private static void interThrows() throws Exception {
        if(b_interceptor == null) {
            throw new NullPointerException("regiestInterceptor=null,可能原因注册地方出错，请换在IMServerAioHandler类中registInterceptor()方法中注册");
        }
    }
}
