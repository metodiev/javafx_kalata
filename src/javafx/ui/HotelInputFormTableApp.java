package javafx.ui;

import javax.swing.text.html.AccessibleHTML.TableElementInfo.TableAccessibleContext;

import javafx.application.Application;
import javafx.database.HotelFormDataAccessor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.model.HotelFormModel;
import javafx.model.Person;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HotelInputFormTableApp extends Application {

	private HotelFormDataAccessor dataAccessor;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// String driverClassName, String dbURL, String user, String password

		/**
		 * 
		 * String url = "jdbc:mysql://localhost:3305/javabase"; String username
		 * = "java"; String password = "password";
		 */
		String driverClassName = "com.mysql.jdbc.Driver";
		String dbUrl = "jdbc:mysql://127.0.0.1:3306/hotel";
		String user = "root";
		String password = "";

		dataAccessor = new HotelFormDataAccessor(driverClassName, dbUrl, user, password); // provide
																						// driverName,
																						// dbURL,
																						// user,
																						// password...
		
		TableView<HotelFormModel> hotelModelTable = new TableView<>();
		TableColumn<HotelFormModel, Long> clientCodeCol = new TableColumn<>("client_code");
		clientCodeCol.setCellValueFactory(new PropertyValueFactory<>("client_code"));
		
		TableColumn<HotelFormModel, String> clientStatusCol = new TableColumn<>("client_status");
		clientStatusCol.setCellValueFactory(new PropertyValueFactory<>("client_status"));
		
		TableColumn<HotelFormModel, String> checkInCol = new TableColumn<>("checkIn");
		checkInCol.setCellValueFactory(new PropertyValueFactory<>("checkIn"));

		hotelModelTable.getColumns().addAll(clientCodeCol, clientStatusCol, checkInCol);

		hotelModelTable.getItems().addAll(dataAccessor.getHotelFormList());
		
		final TextField addFirstName = new TextField();
        addFirstName.setPromptText("First Name");
        addFirstName.setMaxWidth(clientCodeCol.getPrefWidth());
        final TextField addLastName = new TextField();
        addLastName.setMaxWidth(clientStatusCol.getPrefWidth());
        addLastName.setPromptText("Last Name");
        final TextField addEmail = new TextField();
        addEmail.setMaxWidth(checkInCol.getPrefWidth());
        addEmail.setPromptText("Email");
 
        final Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                data.add(new Person(
                        addFirstName.getText(),
                        addLastName.getText(),
                        addEmail.getText()));
                addFirstName.clear();
                addLastName.clear();
                addEmail.clear();
            }
        });
 
		
		
		BorderPane root = new BorderPane();
		root.setCenter(hotelModelTable);
		Scene scene = new Scene(root, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		if (dataAccessor != null) {
			dataAccessor.shutdown();
		}
	}
	
	  public static void main(String[] args) {
	        launch(args);
	    }

}
