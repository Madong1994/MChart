package sample.util;

import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.VBox;

/**
 * Created by 马东 on 2017/11/11.
 *
 * @Author:madong
 * @Description:
 * @Date:Create in 16:42 2017/11/11
 * 关关雎鸠，在河之洲，
 * 窈窕淑女，君子好逑。
 */
public class MsgRectCell extends ListCell<MsgContent> {
    private double width;
    private double height;

    public MsgRectCell(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override
    protected void updateItem(MsgContent msgContent, boolean b) {
        super.updateItem(msgContent, b);
        Label labelSender = new Label();
        labelSender.setPrefSize(width, height/27);
        labelSender.setStyle("-fx-text-fill: rgb(24, 24, 24);-fx-font-size: 150%;");
        Label labelContext = new Label();
        labelContext.setStyle("-fx-text-fill: rgb(122, 114, 124);-fx-font-size: 120%");
        labelContext.setPrefSize(width,2*height/27);
        VBox vBox = new VBox();
        vBox.getChildren().addAll(labelSender,labelContext);
        if (msgContent != null) {
//                rect.setFill(Color.web(item));
            labelSender.setText(msgContent.getSender());
            labelContext.setText(msgContent.getContent());
            setGraphic(vBox);
        }
    }
}
