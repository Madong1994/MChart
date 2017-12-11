package im.common.util.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 马东 on 2017/9/23.
 */
public class DateUtil {
    /**
     * yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String getDate(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(new Date());
        return time;
    }
}
