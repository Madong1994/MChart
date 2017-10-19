package sample;

import im.IMClientStarter;
import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.util.Stages;

public class Main extends Application {
    private StageController stageController;

    @Override
    public void start(Stage primaryStage) throws Exception{

        /*启动im服务*/
        IMClientStarter.startIm();

        stageController = new StageController();
        stageController.setPrimaryStage("primaryStage",primaryStage);

        stageController.loadStage(Stages.loginViewID,"../view/"+Stages.loginView);
        stageController.loadStage(Stages.mainViewID,"../view/"+Stages.mainView);
        stageController.setStage(Stages.loginViewID);
//        stageController.setStage(Stages.mainViewID,Stages.loginViewID);
//        Parent root = FXMLLoader.load(getClass().getResource("../view/sample.fxml"));
//        primaryStage.setTitle("MChart");
//        primaryStage.setScene(new Scene(root, 400, 375));
//        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
