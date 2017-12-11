package sample.util;

import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 马东 on 2017/11/7.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 19:36 2017/11/7
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class MsgContentUtil {
    private static Map<String,Tab> tabMap;
    private static Map<String,Assemblys> assemblysMap;
    private static Map<String,ObservableList<MsgContent>> dataMap;

    public static double width;
    public static double height;

    private Label other;
    private TextArea msg;

    public static Tab getTabMap(String userNum){
        return tabMap.get(userNum);
    }
    public static ObservableList<MsgContent> getDataMap(String userNum){
        return dataMap.get(userNum);
    }

    public static Assemblys getAssemblysMap(String userNum){
        return assemblysMap.get(userNum);
    }

    /**
     * 初始化tabMap
     */
    public static void initializationMap(){
        tabMap = new HashMap<>();
        assemblysMap = new HashMap<>();
        dataMap = new HashMap<>();
    }

    /**
     * 创建tab
     * @param userName
     */
    public static Tab creatTab(final String userName, final String userNumber){
        Tab tab = new Tab();
        tab.setText(userName);

        ObservableList<MsgContent> data = null;
        try {
            data = gainHistoricalRecord(userNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assemblys assemblys = new Assemblys();
        Assemblys.widthAndHeight(width,height);
        VBox vBox = assemblys.getHbox(width,height,data,userNumber);
        tab.setContent(vBox);
        if(!"100000".equals(userNumber)){
            final ObservableList<MsgContent> finalData = data;
            tab.setOnClosed(new EventHandler<Event>() {
                @Override
                public void handle(Event event) {
                    FileUtils.saveChatRecord(userNumber, finalData);
                    assemblysMap.remove(userNumber);
                    tabMap.remove(userNumber);
                    assemblysMap.remove(userNumber);
                }
            });
        }

        tabMap.put(userNumber,tab);
        assemblysMap.put(userNumber,assemblys);
        dataMap.put(userNumber,data);
        return tab;
    }

    /**
     * 获取历史记录
     * @param userNumber
     */
    private static ObservableList<MsgContent> gainHistoricalRecord(String userNumber) throws IOException {


        /*String path = "C:/MChart/"+Me.USER_NUM;
        File filePath = new File(path);
        File file = new File(path+"/"+userNumber+".txt");
        List<MsgContent> msgContentList = new ArrayList<>();
        if(file.exists()){
//            FileOutputStream fileOutputStream = new FileOutputStream("C:/MChart/"+userNumber+".txt");
////            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
////            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//            String strs = "你好：00ui就能看出名字";
//            byte[] bytes = strs.getBytes("UTF-8");
//            bufferedOutputStream.write(bytes);
//            bufferedOutputStream.flush();


//            bufferedWriter.(bytes);
//            bufferedWriter.flush();
//            outputStreamWriter.write(bytes);
//            outputStreamWriter.flush();


            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
            String str = null;
            while ((str = bufferedReader.readLine()) != null){
                System.out.println("--"+str);
                String[] strings = str.split("：");//
                MsgContent msgContent = new MsgContent();
                msgContent.setSender(strings[0]);
                msgContent.setSendTime(strings[1]);
                msgContent.setContent(strings[2]);
                msgContentList.add(msgContent);
            }
        }else {
            if(filePath.exists()){
                boolean creatRes = file.createNewFile();
            }else {
                boolean res = filePath.mkdirs();
            }
        }
        ObservableList<MsgContent> data = FXCollections.observableArrayList(msgContentList);*/
        return FileUtils.getMsgRecord(userNumber);
    }

    public static void main(String[] args) {
        try {
            MsgContentUtil.gainHistoricalRecord("123");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
