module workshopjavafxjdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	exports gui to javafx.fxml;     
	opens gui to javafx.fxml; 
}
