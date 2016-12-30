package javafx.optional;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DatePicker  extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Create the DatePicker.
		DatePicker datePicker = new DatePicker();

		// Add some action (in Java 8 lambda syntax style).
		datePicker.start(primaryStage);
		datePicker.setOnAction(event -> {
			LocalDate date = datePicker.getValue();
			System.out.println("Selected date: " + date);
		});

		// Add the DatePicker to the Stage.
		StackPane root = new StackPane();
		root.getChildren().add(datePicker);
		
		stage.setScene(new Scene(root, 500, 650));
		stage.show();
	}
}
