package sample;

import im.IMClientStarter;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.util.Stages;


//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;

public class Main extends Application {
    private StageController stageController;

    private  double  ofx = 0;
    private  double  ofy = 0;
    @Override
    public void start(Stage primaryStage) throws Exception{
//         MWindow mWindow = new MWindow(1200,750);

//        Dimension screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
//        int width = (int)screensize.getWidth();
//        int height = (int)screensize.getHeight();
//        Image imageOk = new Image(getClass().getResourceAsStream("../../view/img/timg.jpg"));
//        MWindow mWindow = new MWindow(width,height);

        /*BorderPane borderPane = new BorderPane();
        MVBox mvBox = new MVBox(1050,560);
        mvBox.setSpacing(10);
        ArrayList<String> strs = new ArrayList<>();
        for (int i = 0;i< 15; i++){
            strs.add(i+"");
        }
//        mvBox.addFreads(strs);
//        borderPane.getChildren().addAll(mvBox);
//        ChatPane chatPane = new ChatPane(550,750);
        primaryStage.setTitle("MChart");


//        group.getChildren().addAll(new ImageView(new Image(this.getClass().getResourceAsStream("images/logo_16.png"))),mWindow);

        Scene scene = new Scene(mWindow, width, height);
        scene.getStylesheets().add(MWindow.class.getResource("../../view/css/login.css").toExternalForm());
        primaryStage.setScene(scene);
        mWindow.addFriends(strs);
        primaryStage.show();

        final Button button = new Button();
        button.setText("拖拽");
        button.setPrefSize(60,30);
        final Button button1 = new Button();
        button1.setText("拖拽1");
        button1.setPrefSize(60,30);
        button1.setLayoutX(60);
        button1.setLayoutY(100);
        final Text source = new Text();
        source.setLayoutX(160);
        source.setLayoutY(200);
        final Text target = new Text(300, 100, "DROP HERE");

//        source.setOnDragDetected(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                Dragboard db = source.startDragAndDrop(TransferMode.ANY);
//                ClipboardContent content = new ClipboardContent();
//                content.putString(source.getText());
//                db.setContent(content);
//                mouseEvent.consume();
//            }
//        });
//        mWindow.setOnDragOver(new EventHandler<DragEvent>() {
//            @Override
//            public void handle(DragEvent dragEvent) {
//                dragEvent.acceptTransferModes(TransferMode.MOVE);
//                dragEvent.consume();
//            }
//        });


        button1.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

//                ofx = button1.getLayoutX();
                ofx = mouseEvent.getX();
//                ofy = button1.getLayoutY();
                ofy = mouseEvent.getY();
                mouseEvent.consume();
            }
        });
        button1.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                mouseEvent.consume();

                if(mouseEvent.getScreenX() - ofx<0){
                    button1.setLayoutX(0);
                }else {
                    button1.setLayoutX(mouseEvent.getScreenX() - ofx);
                }
                //根据自己的需求，做不同的判断
                if (mouseEvent.getScreenY() - ofy < 0) {
                    button1.setLayoutY(0);
                } else {
                    button1.setLayoutY(mouseEvent.getScreenY() - ofy-button1.getHeight());
                }
                source.setText("x="+button1.getLayoutX()+" y="+button1.getLayoutY());
            }
        });
//        mWindow.getChildren().addAll(button1,source);*/
//        /*启动im服务*/
        IMClientStarter.startIm();

        stageController = new StageController();
        stageController.setPrimaryStage("primaryStage",primaryStage);

        stageController.loadStage(Stages.loginViewID,"../view/"+Stages.loginView);
//        stageController.loadStage(Stages.mainViewID,"../view/"+Stages.mainView);
        stageController.loadStage(Stages.mwindow);
        stageController.setStage(Stages.loginViewID);

//        stageController.setStage(Stages.mainViewID, Stages.loginViewID);
//        Parent root = FXMLLoader.load(getClass().getResource("../view/login.fxml"));
//        primaryStage.setTitle("MChart");
//        primaryStage.setScene(new Scene(root, 400, 375));
//        primaryStage.show();
    }
    public VBox addVBox() {
        VBox vbox = new VBox();
        vbox.setPrefSize(20,56);
        vbox.setPadding(new Insets(1,1,101,1)); //内边距
        vbox.setSpacing(8); //节点间距

        Text title = new Text("Data");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox.getChildren().add(title);


        for (int i=0; i<14; i++){
            Button button = new Button();
            button.setPrefSize(30,26);
            button.setText(""+i);
            VBox.setMargin(button, new Insets(0, 0, 0, 8)); //为每个节点设置外边距
            vbox.getChildren().add(button);
        }

        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
