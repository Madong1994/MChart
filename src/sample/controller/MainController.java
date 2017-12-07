package sample.controller;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import sample.StageController;
import sample.compoment.MVBox;
import sample.util.ControllerdStage;

import java.util.ArrayList;

/**
 * Created by 马东 on 2017/10/19.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 19:52 2017/10/19
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class MainController implements ControllerdStage {
    private StageController stageController;

    private BorderPane borderPane;
    private VBox vBox;
    private HBox hBox;

    public MainController(){
        init();
    }
    private void init(){
        BorderPane borderPane = new BorderPane();
        MVBox mvBox = new MVBox(360,660);
        ArrayList<String> strs = new ArrayList<>();
        for (int i = 0;i< 5; i++){
            strs.add(i+"");
        }
        mvBox.addFreads(strs);
        borderPane.getChildren().addAll(mvBox);
    }
    @Override
    public void setStageController(StageController controller) {
        this.stageController = controller;
    }
    public StageController getStageController(){
        return stageController;
    }
}
