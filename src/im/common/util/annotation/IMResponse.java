package im.common.util.annotation;

import java.lang.annotation.*;

/**
 * Created by 马东 on 2017/10/12.
 */
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IMResponse {
    int responseCode();
}
