module com.example.chapter_06 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.chapter_06 to javafx.fxml;
    exports com.example.chapter_06;
}