package sample.compoment;

import entity.User;
import im.common.util.tool.DateUtil;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import sample.util.MsgContent;
import sample.util.MsgContentUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 马东 on 2017/10/23.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 21:22 2017/10/23
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class MVBox extends VBox {
    private double width;
    private double height;
    private ChatPane chatPane;
    private String[] colors = {"-fx-background-color:rgba(135, 174, 254, 0.27);-fx-text-fill: rgb(0, 0, 0)","-fx-background-color:rgba(117, 155, 174, 0.29);-fx-text-fill: rgb(0, 0, 0)","-fx-background-color:rgba(143, 154, 243, 0.53);-fx-text-fill: rgb(0, 0, 0)","-fx-background-color:rgba(95, 122, 140, 0.29);-fx-text-fill: rgb(0, 0, 0)"};

    public void setChatPane(ChatPane chatPane) {
        this.chatPane = chatPane;
    }

    public MVBox(double width, double height){
        this.width = width;
        this.height = height;
//        this.setPrefSize(width,height);
//        this.setStyle("-fx-background:transparent;");
        init();
    }
    public void init(){

    }
    public void addFriends(List<User> frends){
        this.getChildren().addAll(addBoxs(frends));
    }
    private List<HBox> addBoxs(final List<User> frends){
        this.setSpacing(3);
        HBox hBox = null;
        List<HBox> hBoxes = new ArrayList<>();
        for(int i = 0;i< frends.size();i++){

            if( i % 2 == 0 ){
                hBox = new HBox();
                hBox.setPrefSize(width,height/6);
//                hBox.setOpacity(0.8);
                hBox.setSpacing(3);
                hBox.setStyle("-fx-background:transparent");
                hBoxes.add(hBox);
            }
            Random random = new Random();
            int ra1 = random.nextInt(4);
            Button child = new Button();
            final int a = i;
            child.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    Tab userTab = MsgContentUtil.getTabMap(frends.get(a).getUserNum());
                    if(userTab == null){
                        Tab tab = MsgContentUtil.creatTab(frends.get(a).getUserName(),frends.get(a).getUserNum());
                        chatPane.getTabPane().getTabs().add(tab);
                    }

                }
            });
//            child.setOpacity(0.4);
//            Image imageOk = new Image(getClass().getResourceAsStream("../../view/img/timg.jpg"));
//            child.setGraphic(new ImageView(imageOk));
            if(frends.get(i).getUserNum().equals("100000")){
                Tab tab = MsgContentUtil.creatTab(frends.get(i).getUserName(),frends.get(i).getUserNum());
                chatPane.getTabPane().getTabs().add(tab);
                ObservableList<MsgContent> contents = MsgContentUtil.getDataMap("100000");
                MsgContent welComeContent = new MsgContent();
                welComeContent.setSender(frends.get(i).getUserName());

                welComeContent.setContent("欢迎使用 马东 编写的聊天系统!");
                welComeContent.setPaint(Color.LIGHTSEAGREEN);
                welComeContent.setMsgType("TEXT");
                welComeContent.setSendTime(DateUtil.getDate());
                MsgContent content = new MsgContent();
                content.setSender(frends.get(i).getUserName());

                content.setContent("服务器链接成功!");
                content.setPaint(Color.RED);
                content.setMsgType("TEXT");
                content.setSendTime(DateUtil.getDate());
                contents.add(content);
                contents.add(welComeContent);
            }

            child.setText(frends.get(i).getUserName());
//            child.setTextFill(Paint.valueOf("rgba(17, 145,  213)"));
            child.setStyle(colors[ra1]);
            child.setPrefSize(width/2-3,height/6);

            hBox.getChildren().addAll(child);

        }
        return hBoxes;
    }
}
