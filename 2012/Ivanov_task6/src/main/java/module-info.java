module ru.ivanov.ivanov_task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ivanov.ivanov_task6 to javafx.fxml;
    exports ru.ivanov.ivanov_task6;
}