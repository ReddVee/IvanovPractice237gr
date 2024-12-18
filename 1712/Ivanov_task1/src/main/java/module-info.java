module ru.ivanov.ivanov_task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ivanov.ivanov_task1 to javafx.fxml;
    exports ru.ivanov.ivanov_task1;
}