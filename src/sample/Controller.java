package sample;

import entity.User;
import im.common.protof.RequestModel;
import im.common.util.RequestCode;
import im.common.util.tool.DateUtil;
import im.common.util.tool.IMSend;
import im.common.util.tool.ProtoBufUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.regex.Pattern;

public class Controller {
    @FXML
    private Text actionTaget;
    @FXML
    private TextField userIdTarg;
    @FXML
    private PasswordField passwordField;
    @FXML
    public void handleSubmitButtonActiom(ActionEvent event){
        String userNum = userIdTarg.getText();
        String pwd = passwordField.getText();
        boolean us = Pattern.matches("\\d{5,8}",userNum);
        if(us&&pwd != null&& !pwd.equals("")){
            String data = User.toJson(userNum,pwd);
            RequestModel.ImRequest imRequest = ProtoBufUtil.requestModelFactory(RequestCode.LOGIN,0,"0","0", DateUtil.dateFactory(),data);
            IMSend.send(imRequest);
        }
//        actionTaget.setText("hjaknmc");
    }
}
