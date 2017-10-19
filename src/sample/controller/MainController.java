package sample.controller;

import sample.StageController;
import sample.util.ControllerdStage;

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
    @Override
    public void setStageController(StageController controller) {
        this.stageController = controller;
    }
    public StageController getStageController(){
        return stageController;
    }
}
