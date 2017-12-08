package sample.util;

import entity.TextMessage;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.Callback;

/**
 * Created by 马东 on 2017/11/9.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 21:48 2017/11/9
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class Assemblys {
    private VBox vBox;
    private HBox sendBox;
    private HBox otherBox;
    private Label send_left_lable;
    private Label other;
    private Button sendMsg;
    private TextArea msg;
    private ListView<MsgContent> msgContentListView;


    private static double width_static;
    private static double height_static;

    private double width;
    private double height;

    public static void widthAndHeight(double width,double height){
        Assemblys.width_static = width;
        Assemblys.height_static = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private VBox creatVbox(final double width, final double height, ObservableList<MsgContent> data, final String userNum){
        this.width = width;
        this.height = height;
        msgContentListView = new ListView<>();
        msgContentListView.setPrefHeight(height/2);
        msgContentListView.setPrefWidth(width);
        msgContentListView.setItems(data);
        msgContentListView.setCellFactory(new Callback<ListView<MsgContent>, ListCell<MsgContent>>() {
            @Override
            public ListCell<MsgContent> call(ListView<MsgContent> msgContentListView) {

//                return new ColorRectCell();
                return new MsgRectCell(width,height);
            }
        });
//                .setCellFactory(new Callback<ListView<MsgContent>, ListCell<MsgContent>>() {
//            @Override
//            public ListCell<MsgContent> call(ListView<MsgContent> stringListView) {
//                return new ColorRectCell();
//            }
//        });

        vBox = new VBox();
        vBox.setSpacing(5);

        sendBox = new HBox();
        otherBox = new HBox();

        send_left_lable = new Label();
        send_left_lable.setPrefSize(3*width/5,height/12);

        other = new Label();
        other.setPrefSize(width,height/6);

        msg= new TextArea();
        msg.setPrefSize(width,height/6);
        msg.setStyle("-fx-font-size:18;-fx-alternative-column-fill-visible: true;-fx-alternative-row-fill-visible: true;-fx-arrows-visible: true");

        sendMsg = new Button("发送");
        sendMsg.setPrefSize(2*width/5,height/12);

//        onClickHandler onClickHandler = new onClickHandler();
//        onClickHandler.userNum = userNum;
        sendMsg.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                MsgContent msgContent = new MsgContent();
                //todo 缺少发送者
                msgContent.setSender("me");
                msgContent.setContent(msg.getText());
                msg.clear();
                System.out.println("---"+msg.getText());
                ObservableList<MsgContent> observableList = MsgContentUtil.getDataMap(userNum);
                System.out.println(observableList);
                msgContent.setPaint(Color.YELLOWGREEN);
                observableList.add(msgContent);
                MsgContentUtil.getAssemblysMap(userNum).msgContentListView.scrollTo(observableList.size());

                TextMessage textMessage = new TextMessage();
                textMessage.setMsgType("TEXT");
//                textMessage.setMsg();
                //todo 发送消息没有写
//                RequestModel.ImRequest imRequest = ProtoBufUtil.requestModelFactory(RequestCode.SEND_MSG, HandlerCode.REQUEST,"0","0", DateUtil.dateFactory(),user.getUserNum());
//                IMSend.send();
            }
        });

        sendBox.getChildren().addAll(send_left_lable,sendMsg);
        otherBox.getChildren().addAll(other);
        vBox.getChildren().addAll(msgContentListView,msg,sendBox,otherBox);
        return vBox;
    }
    public VBox getHbox(double width,double height,ObservableList<MsgContent> data,String userNum){
        return creatVbox(width,height,data,userNum);
    }
//    class onClickHandler implements EventHandler<MouseEvent> {
//        public String userNum;
//
//        @Override
//        public void handle(MouseEvent mouseEvent) {
//            System.out.println("???");
//            MsgContent msgContent = new MsgContent();
//            msgContent.setSender("me");
//            msgContent.setContent("yhjm");
//            System.out.println("---"+msg.getText());
//            ObservableList<MsgContent> observableList = MsgContentUtil.getDataMap(userNum);
//            observableList.add(msgContent);
//        }
//    }
    static class ColorRectCell extends ListCell<MsgContent> {
        @Override
        public void updateItem(MsgContent item, boolean empty) {
            super.updateItem(item, empty);
//            Rectangle rect = new Rectangle(width, height/9);
            Label labelSender = new Label();
            labelSender.setPrefSize(width_static, height_static/27);
            labelSender.setStyle("-fx-text-fill: rgb(24, 24, 24);-fx-font-size: 150%;");
            Label labelContext = new Label();
            labelContext.setStyle("-fx-text-fill: rgb(122, 114, 124);-fx-font-size: 120%");
            labelContext.setPrefSize(width_static,2*height_static/27);
            VBox vBox = new VBox();
            vBox.getChildren().addAll(labelSender,labelContext);
            if (item != null) {
//                rect.setFill(Color.web(item));
                labelSender.setText(item.getSender());
                labelContext.setText(item.getContent());
                setGraphic(vBox);
            }
        }


//    @Override
//    protected void updateItem(MsgContent msgContent, boolean b) {
//        super.updateItem(msgContent, b);
//        Label labelSender = new Label();
//        labelSender.setPrefSize(width_static, height_static/27);
//        labelSender.setStyle("-fx-text-fill: rgb(24, 24, 24);-fx-font-size: 150%;");
//        Label labelContext = new Label();
//        labelContext.setStyle("-fx-text-fill: rgb(122, 114, 124);-fx-font-size: 120%");
//        labelContext.setPrefSize(width_static,2*height_static/27);
//        VBox vBox = new VBox();
//        vBox.getChildren().addAll(labelSender,labelContext);
//        if (msgContent != null) {
////                rect.setFill(Color.web(item));
//            labelSender.setText(msgContent.getSender());
//            labelContext.setText(msgContent.getContent());
//            setGraphic(vBox);
//        }
//    }
    }
}
