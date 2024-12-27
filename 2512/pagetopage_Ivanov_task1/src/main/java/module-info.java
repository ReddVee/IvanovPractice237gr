module ru.ivanov.pagetopage_ivanov_task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.ivanov.pagetopage_ivanov_task1 to javafx.fxml;
    exports ru.ivanov.pagetopage_ivanov_task1;
    exports ru.ivanov.pagetopage_ivanov_task1.controller;
    opens ru.ivanov.pagetopage_ivanov_task1.controller to javafx.fxml;
}