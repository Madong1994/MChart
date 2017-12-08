package sample.compoment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import sample.util.MsgContentUtil;

/**
 * Created by 马东 on 2017/10/24.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 19:56 2017/10/24
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class ChatPane extends BorderPane{
    private double width;
    private double height;


    private TabPane tabPane;

    public TabPane getTabPane() {
        return tabPane;
    }

    public void setTabPane(TabPane tabPane) {
        this.tabPane = tabPane;
    }

    ObservableList<String> data = FXCollections.observableArrayList();

    private ListView<String> listView;

    public ChatPane(double height,double width){
        this.width = width;
        this.height = height;
        this.setPrefSize(height,width);
        init();
    }
    private void init(){
        VBox vBox = new VBox();
        Button button = new Button("ADD");
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String red = data.get(0);
                int i = data.size();
                data.add("black");
            }
        });
        Label label = new Label();
        label.setPrefSize(width,height/12);
        label.setText("这是一个标题框");

        tabPane = new TabPane();
//        final Tab tab1 = new Tab();
//        tab1.setText("tab1");
//        Tab tab2 = new Tab();
//        tab2.setText("tab2");
//        tab1.setOnClosed(new EventHandler<Event>() {
//            @Override
//            public void handle(Event event) {
//                System.out.println("what?");
//            }
//        });
//        listView = new ListView<>();
//        listView.setPrefHeight(2*height/5);
//        listView.setPrefWidth(width);
////        listView.
//        listView.setItems(data);
//        listView.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
//            @Override
//            public ListCell<String> call(ListView<String> stringListView) {
//                return new ColorRectCell();
//            }
//        });
//        vBox.setSpacing(5);
//        tab1.setContent(listView);
//        tab2.setContent(listView);
//
//        tabPane.setRotateGraphic(true);
//        tabPane.setRotate(10);
//
//
//        tabPane.getTabs().addAll(tab2,tab1);
//        vBox.getChildren().addAll(label,tabPane);
        MsgContentUtil.width = width;
        MsgContentUtil.height =height;
        MsgContentUtil.initializationMap();
//        Tab tab = MsgContentUtil.creatTab("系统消息","123456");
//        tab.setOnClosed(new EventHandler<Event>() {
//            @Override
//            public void handle(Event event) {
//                System.out.println("?");
////                event.consume();
//            }
//        });
//        Tab tab1 = MsgContentUtil.creatTab("我的名字叫","12345");
//        tabPane.getTabs().addAll(tab,tab1);
        this.setTop(label);
        this.setBottom(tabPane);
    }
//    class ColorRectCell extends ListCell<String> {
//        @Override
//        public void updateItem(String item, boolean empty) {
//            super.updateItem(item, empty);
//            Rectangle rect = new Rectangle(width, height/9);
//            if (item != null) {
//                rect.setFill(Color.web(item));
//                setGraphic(rect);
//            }
//        }
//    }
}
