package sample.util;

import javafx.geometry.Pos;
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
        labelSender.setStyle("-fx-text-fill: rgb(16, 12, 255);-fx-font-size: 130%;");
        Label labelContext = new Label();
        labelContext.setStyle("-fx-font-size: 120%");
//        labelContext.setTextFill(Color.RED);
        labelContext.setPrefSize(width,2*height/27);
        VBox vBox = new VBox();
        vBox.getChildren().addAll(labelSender,labelContext);
        if (msgContent != null) {
//todo 没有显示信息内容
            labelContext.setTextFill(msgContent.getPaint());
            if(Me.USER_NUM.equals(msgContent.getSender())){
                labelSender.setAlignment(Pos.BASELINE_RIGHT);
                labelContext.setAlignment(Pos.BASELINE_RIGHT);
                labelSender.setText(":"+msgContent.getSendTime()+" "+msgContent.getSender());
            }else {
                labelSender.setText(msgContent.getSender()+" "+msgContent.getSendTime()+":");
            }
//                rect.setFill(Color.web(item));
            labelContext.setText(msgContent.getContent());
            setGraphic(vBox);
        }
    }
}
