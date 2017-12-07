package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 马东 on 2017/11/10.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 21:04 2017/11/10
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class testMain extends Application{

    private static Map<String,ObservableList<String>> dataMap = new HashMap<>();;
    ObservableList<String> dataa = FXCollections.observableArrayList(
            "chocolate", "salmon", "gold", "coral", "darkorchid",
            "darkgoldenrod", "lightsalmon", "black", "rosybrown", "blue",
            "blueviolet", "brown");
    ObservableList<String> data2 = FXCollections.observableArrayList(
            "chocolate", "salmon", "gold", "coral", "darkorchid",
            "darkgoldenrod", "lightsalmon", "black", "rosybrown", "blue",
            "blueviolet", "brown");
    public static ObservableList<String> getDataMap(String userNum){

        return dataMap.get(userNum);
    }

    @Override
    public void start(Stage stage) {



        TabPane tabPane = new TabPane();
        Tab tab1 = new Tab();
        tab1.setText("tab1");
        Tab tab2 = new Tab();
        tab2.setText("tab2");
        for(int i = 0;i<3;i++){

        }
        TestPane testPane1 = new TestPane(dataa,"1");
        TestPane testPane2 = new TestPane(data2,"2");

        tab1.setContent(testPane1.getBox());
        tab2.setContent(testPane2.getBox());
        tabPane.getTabs().addAll(tab1,tab2);

        dataMap.put("1",dataa);
        dataMap.put("2",data2);

        stage.setTitle("ListViewSample");

        ObservableList<String> data = testMain.getDataMap("123");

        Scene scene = new Scene(tabPane, 200, 200);
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
