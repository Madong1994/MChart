package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.compoment.MWindow;
import sample.util.ControllerdStage;

import java.awt.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class StageController {
    private Map<String,Stage> stageMap = new HashMap<String, Stage>();
    private Map<String,Pane> paneMap = new HashMap<String, Pane>();

    public void addStage(String name,Stage stage){
        stageMap.put(name,stage);
    }
    public Stage getStage(String name){
        return stageMap.get(name);
    }

    public Pane getPane(String name) {
        return paneMap.get(name);
    }

    public void addPane(String nema,Pane pane) {
        this.paneMap.put(nema,pane);
    }

    /**
     * 添加主舞台
     * @param primaryStageName
     * @param primaryStage
     */
    public void setPrimaryStage(String primaryStageName, Stage primaryStage){
        this.addStage(primaryStageName,primaryStage);
    }

    /**
     * 添加自定义窗口
     * @param id
     * @param childPain
     * @return
     */
    public boolean loadStage(String id,Pane childPain){
        Scene compent = new Scene(childPain,childPain.getWidth(),childPain.getHeight());
        Stage tempStage = new Stage();
        tempStage.setScene(compent);
        this.addStage(id,tempStage);
        return true;
    }
    public boolean loadStage(String name, String resources, StageStyle... styles){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(resources));
        try {
            Pane tempPane = (Pane) loader.load();
            //通过Loader获取FXML对应的ViewCtr，并将本StageController注入到ViewCtr中
            ControllerdStage controlledStage = loader.getController();
            controlledStage.setStageController(this);

            //构造对应的Stage
            Scene tempScene = new Scene(tempPane);
            Stage tempStage = new Stage();
            tempStage.setScene(tempScene);

            //配置initStyle
            for(StageStyle style:styles){
                tempStage.initStyle(style);
            }
            //将设置好的Stage放到HashMap中
            this.addStage(name,tempStage);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 加载新窗口
     * @param name
     * @return
     */
    public boolean loadStage(String name){

        Dimension screensize   =   Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)screensize.getWidth();
        int height = (int)screensize.getHeight();
//            Pane tempPane = (Pane) loader.load();
        //通过Loader获取FXML对应的ViewCtr，并将本StageController注入到ViewCtr中
        MWindow mWindow = new MWindow(width,height);
        this.addPane(name,mWindow);
        //构造对应的Stage
        Scene tempScene = new Scene(mWindow);
        Stage tempStage = new Stage();
        tempStage.setScene(tempScene);

        //配置initStyle
//            for(StageStyle style:styles){
//                tempStage.initStyle(style);
//            }
        //将设置好的Stage放到HashMap中
        this.addStage(name,tempStage);
        return true;

    }

    /**
     * 显示Stage但是不隐藏其他任何Stage
     * @param name
     * @return
     */
    public boolean setStage(String name){
        this.getStage(name).show();
        return true;
    }

    /**
     * 隐关闭前一个，开启另一个
     * @param show
     * @param close
     * @return
     */
    public boolean setStage(String show, String close){
        getStage(close).close();
        setStage(show);
        return true;
    }
    public boolean unloadStage(String name){
        if(stageMap.remove(name) == null){
            System.out.println("窗口不存在，请检查名称");
            return false;
        }else {
            System.out.println("窗口移除成功");
            return true;
        }
    }
}
