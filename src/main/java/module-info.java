module com.example.apgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.apgame to javafx.fxml;
    exports com.example.apgame;
}