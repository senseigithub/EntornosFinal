module dam.senseigithub {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires org.junit.jupiter.api;
    opens dam.senseigithub to javafx.fxml;
    exports dam.senseigithub;
}
