package sample.util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 马东 on 2017/12/11.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 19:57 2017/12/11
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class FileUtils {


    public static boolean saveChatRecord(String userNumber,ObservableList<MsgContent> contents) {
        String path = "C:/MChart/" + Me.USER_NUM;
        File filePath = new File(path);
        File file = new File(path + "/" + userNumber + ".txt");
        /*List<MsgContent> msgContentList = new ArrayList<>();*/
        if (!file.exists()) {
            if(filePath.exists()){
                try {
                    boolean creatRes = file.createNewFile();
                } catch (IOException e) {
                    return false;
//                    e.printStackTrace();
                }
            }else {
                boolean res = filePath.mkdirs();
            }
        }

            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path + "/" + userNumber + ".txt");
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                StringBuffer stringBuffer = new StringBuffer();
                for(MsgContent content:contents){
                    stringBuffer.append(content.getSender()+"@:@"+content.getSendTime()+"@:@"+content.getMsgType()+"@:@"+content.getContent()+System.getProperty("line.separator"));//todo 换行
                }
                String strs = stringBuffer.toString();
                byte[] bytes = strs.getBytes("UTF-8");
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                return false;
            }
            /*bufferedWriter.(bytes);
            bufferedWriter.flush();
            outputStreamWriter.write(bytes);
            outputStreamWriter.flush();*/

        return true;
    }
    public static ObservableList<MsgContent> getMsgRecord(String userNumber){
        List<MsgContent> msgContentList = new ArrayList<>();
        String path = "C:/MChart/" + Me.USER_NUM;
//        File filePath = new File(path);
        File file = new File(path + "/" + userNumber + ".txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
            String str = null;
            while ((str = bufferedReader.readLine()) != null){
                System.out.println("--"+str);
                String[] strings = str.split("\\@:\\@");//todo 此处信息截取有bug,不应该是strings[2]
                MsgContent msgContent = new MsgContent();
                msgContent.setSender(strings[0]);
                msgContent.setSendTime(strings[1]);
                msgContent.setContent(strings[2]);
                msgContent.setMsgType(strings[3]);
                msgContentList.add(msgContent);
            }
        }
        catch (IOException e){
            //todo 异常处理
        }

    ObservableList<MsgContent> data = FXCollections.observableArrayList(msgContentList);
    return data;
    }
}
