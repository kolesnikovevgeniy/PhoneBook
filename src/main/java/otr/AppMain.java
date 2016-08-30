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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static javafx.scene.input.DataFormat.URL;

public class AppMain extends Application {

    private Map<String,ArrayList<String>> mpPhones = new HashMap<String, ArrayList<String>>();

    public static void main(String[] args) throws Exception {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String fxmlFile = "fxml/phonebookgui.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getClassLoader().getResourceAsStream(fxmlFile));

        // инициализируем справочник
        mpPhones.put("Иванов И.И.", new ArrayList<String>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        mpPhones.put("Петров П.П.", new ArrayList<String>(Arrays.asList("+8 800 2000 700")));
        mpPhones.put("Сидоров С.С.", new ArrayList<String>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000")));

        // создаем контроллер
        Controller controller = loader.getController();
        controller.setMainApp(this);

        stage.setTitle("PhoneBook");
        stage.setScene(new Scene(root));
        stage.show();

    }
    // функция поиска в справочнике
    public ArrayList<String> searchPhone(String strFio)
    {
        if (mpPhones.containsKey(strFio))
        {
            return mpPhones.get(strFio);
        }
        return null;
    }
}
