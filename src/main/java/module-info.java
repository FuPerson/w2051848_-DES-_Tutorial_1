module org.example.designtutorial1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.designtutorial1 to javafx.fxml;
    exports org.example.designtutorial1;
}