module ru.ivanov.ivanov_task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.ivanov.ivanov_task2 to javafx.fxml;
    exports ru.ivanov.ivanov_task2;
}