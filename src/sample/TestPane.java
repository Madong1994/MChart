package sample;

import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

/**
 * Created by 马东 on 2017/12/7.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 20:48 2017/12/7
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class TestPane  {
    public VBox box;
    public ListView<String> list = new ListView<>();
    public TestPane(ObservableList<String> data, final String name){

        box = new VBox();
        list.setItems(data);
        list.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
            @Override
            public ListCell<String> call(ListView<String> stringListView) {
                return new ColorRectCell();
            }
        });
        Button button = new Button(name);

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                ObservableList<String> data = testMain.getDataMap(name);
                data.add("RED"+name);
//                list.setItems(data);
            }
        });
        box.getChildren().addAll(list,button);
        VBox.setVgrow(list, Priority.ALWAYS);



    }
    static class ColorRectCell extends ListCell<String> {
        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            Label labelSender = new Label();
            labelSender.setPrefSize(100,20);
            if (item != null) {
                labelSender.setText("iiiiiiiiiiiiii"+item);
                setGraphic(labelSender);
            }
        }
    }
    public VBox getBox(){
        return box;
    }
}
