import java.io.IOException;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    private Stage stage;
    private Parent root;
    private Scene scene;
    public void createAcc(ActionEvent event) throws IOException
    {
        //stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("createacc.fxml"));
        scene = new Scene(root);
        stage = new Stage();
        stage.setScene(scene);
        //stage.setScene(scene);
        stage.show();
    }
    public void back(ActionEvent event) throws IOException
    {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        // root = FXMLLoader.load(getClass().getResource("officielpage.fxml"));
        // scene = new Scene(root);
        // stage.setScene(scene);
        stage.close();
    }


    public void back2(ActionEvent event) throws IOException
    {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("officielpage.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        //stage.close();
    }


    public void logIn(ActionEvent event) throws IOException
    {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("facepage.fxml"));
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private DatePicker myDate;
    @FXML
    private TextField myText;
    public void change(ActionEvent event)
    {
        myText.setText(myDate.getValue().toString());
    }
}
