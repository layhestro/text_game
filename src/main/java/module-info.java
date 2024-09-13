module edu.um.roguetext {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.um.roguetext to javafx.fxml;
    exports edu.um.roguetext;
}
