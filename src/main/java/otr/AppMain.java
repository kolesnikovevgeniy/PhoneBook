package otr;

/**
 * Created by user on 03.08.2016.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.util.ArrayList;

import static javafx.scene.input.DataFormat.URL;

public class AppMain extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "fxml/phonebookgui.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getClassLoader().getResourceAsStream(fxmlFile));

        //Controller controller = loader.getController();
        //controller.setMainApp(this);

        stage.setTitle("PhoneBook");
        stage.setScene(new Scene(root));
        stage.show();
    }

    //public ArrayList<String> getScopeFromIP()
    //{
    //    return null;
    //}
}
