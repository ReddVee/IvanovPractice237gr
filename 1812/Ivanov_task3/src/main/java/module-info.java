module ru.ivanov.ivanov_task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ivanov.ivanov_task3 to javafx.fxml;
    exports ru.ivanov.ivanov_task3;
}