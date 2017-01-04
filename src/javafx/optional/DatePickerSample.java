package javafx.optional;

import java.util.Locale;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DatePickerSample  {

	private Stage stage;
	private DatePicker checkInDatePicker;
	

/*	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		launch(args);
	}*/

	/**
	 * @return the stage
	 */
	public Stage getStage() {
		return stage;
	}

	/**
	 * @param stage the stage to set
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}

	/**
	 * @return the checkInDatePicker
	 */
	public DatePicker getCheckInDatePicker() {
		return checkInDatePicker;
	}

	/**
	 * @param checkInDatePicker the checkInDatePicker to set
	 */
	public void setCheckInDatePicker(DatePicker checkInDatePicker) {
		this.checkInDatePicker = checkInDatePicker;
	}

	
/*
	@Override
	public void start(Stage stage) {
		this.stage = stage;
		stage.setTitle("DatePickerSample ");
		initUI();
		 hbox.getChildren().add(stage) 
		stage.show();
	}*/

	public HBox initUI() {
		VBox vbox = new VBox(20);
		vbox.setStyle("-fx-padding: 10;");
		Scene scene = new Scene(vbox, 400, 400);
		stage.setScene(scene);

		checkInDatePicker = new DatePicker();

		GridPane gridPane = new GridPane();
		gridPane.setHgap(10);
		gridPane.setVgap(10);

		Label checkInlabel = new Label("Check-In Date:");
		gridPane.add(checkInlabel, 0, 0);

		GridPane.setHalignment(checkInlabel, HPos.LEFT);
		gridPane.add(checkInDatePicker, 0, 1);
		HBox h = new HBox();
		h.getChildren().add(gridPane);
		//vbox.getChildren().add(gridPane);

		return h;

	}

	public HBox getDatePicker() {
		HBox hbox = new HBox();

		hbox.getChildren().add(initUI());
		return hbox;
	}
}