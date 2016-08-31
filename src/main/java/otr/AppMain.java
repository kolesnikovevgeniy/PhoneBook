package otr;

/**
 * Created by user on 03.08.2016.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import otr.Model.PhoneBook;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static javafx.scene.input.DataFormat.URL;

public class AppMain extends Application {
    private PhoneBook pb = new PhoneBook();
    public static void main(String[] args) throws Exception {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "fxml/phonebookgui.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getClassLoader().getResourceAsStream(fxmlFile));

        // создаем контроллер
        Controller controller = loader.getController();
        controller.setModel(pb);

        stage.setTitle("PhoneBook");
        stage.setScene(new Scene(root));
        stage.show();

    }

}
