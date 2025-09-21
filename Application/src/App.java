import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        Image img = new Image("fb.png");
        // ImageView image = new ImageView(img);
        Parent root = FXMLLoader.load(getClass().getResource("officielpage.fxml"));
        Scene laScene=new Scene(root);
        arg0.setScene(laScene);
        arg0.setTitle("FACEBOOK Application");
        arg0.getIcons().add(img);
        arg0.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
