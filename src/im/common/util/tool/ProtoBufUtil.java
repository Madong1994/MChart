package im.common.util.tool;

import im.common.protof.RequestModel;

/**
 * Created by 马东 on 2017/9/23.
 */
public class ProtoBufUtil {
    /**
     * ImRequest生成器
     * @param code
     * @param handle
     * @param uniqueOne
     * @param uniqueTwo
     * @param time
     * @param data
     * @return
     */
    public static RequestModel.ImRequest requestModelFactory(int code,int handle,String uniqueOne,String uniqueTwo,String time,String data){
        RequestModel.ImRequest.Builder builder = RequestModel.ImRequest.newBuilder();
        builder.setCode(code);
        builder.setHandler(handle);
        builder.setUniqueOne(uniqueOne);
        builder.setUniqueTwo(uniqueTwo);
        builder.setTime(time);
        builder.setData(data);
        RequestModel.ImRequest imRequest = builder.build();
        return imRequest;
    }
}
