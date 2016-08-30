package otr;

/**
 * Created by user on 30.08.2016.
 */
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

import java.util.ArrayList;

public class Controller {
    @FXML
    private TextField tfSearch;

    @FXML
    private TextArea tfOutput;

    @FXML
    private Label lOutput;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnExit;

    // Ссылка на главное приложение.
    private AppMain mainApp;

    /**
     * Конструктор.
     */
    public Controller() {
    }

    /**
     * Обработчик нажатия на кнопку поиска.
     */
    @FXML
    private void handleStart() {
        outputPhones(mainApp.searchPhone(tfSearch.getText()));
    }

    // вывод найденных телефонов
    private void outputPhones(ArrayList<String> arrPhones)
    {

        if (arrPhones == null) {
            tfOutput.setText("Такого ФИО в справочнике нет!");
            return;
        }

        String stOut = "";
        for(int i = 0; i < arrPhones.size();i++)
        {
            stOut += arrPhones.get(i) + "\r\n";
        }
        tfOutput.setText(stOut);
    }


    /**
     * Обработчик нажатия на кнопку выхода.
     */
    @FXML
    private void handleExit() {
        try {
            // выход
            System.exit(0);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    /**
     * Инициализация класса-контроллера.
     */
    @FXML
    private void initialize() {

    }

    /**
     * Сохраняем ссылку на главное приложение
     * @param mainApp
     */
    public void setMainApp(AppMain mainApp) {
        this.mainApp = mainApp;
    }
}

