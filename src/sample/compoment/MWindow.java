package sample.compoment;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;

import java.util.List;

/**
 * Created by 马东 on 2017/10/22.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 21:14 2017/10/22
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class MWindow extends BorderPane{

    private MVBox mvBox;
    private ChatPane chatPane;
    private Label label;

    private double width;
    private double height;

    public ChatPane getChatPane() {
        return chatPane;
    }

    public void setChatPane(ChatPane chatPane) {
        this.chatPane = chatPane;
    }

    public MWindow(double width, double height) {
        this.height = height;
        this.width = width;


//        Group group = new Group();
//        group.getChildren().addAll(new ImageView(imageOk),this);
//        this.s
//        this.setStyle(" -fx-background-image: url('../../view/img/timg.jpg')");
//        this.setStyle("-fx-background-color:rgb(89, 187, 254)");
        this.getStylesheets().add(MWindow.class.getResource("../../view/css/login.css").toExternalForm());
        this.getStyleClass().add("main");

        init();
    }
    private void init(){
        mvBox = new MVBox(width/5,height);
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setOpacity(0.6);
//        scrollPane.setStyle("-fx-background:transparent;");
        scrollPane.setPrefSize(width/5,height);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setContent(mvBox);
        chatPane = new ChatPane(3*width/5,height);
        chatPane.setOpacity(0.6);
        mvBox.setChatPane(chatPane);
        label = new Label("预留");
        label.setPrefSize(width/5,height);
        label.setText("预留");

        this.setLeft(scrollPane);
        this.setCenter(chatPane);
        this.setRight(label);
    }
    public void addFriends(List<String> friends){
        mvBox.addFreads(friends);
    }

}
