package javafx.ui;

//see this blog for more info http://code.makery.ch/blog/javafx-dialogs-official/
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.database.HotelFormDataAccessor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.model.HotelFormModel;
import javafx.model.Person;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HotelInputFormTableApp extends Application {

	private HotelFormDataAccessor dataAccessor;

	private final ObservableList<Person> data =
            FXCollections.observableArrayList(
            new Person("Jacob", "Smith", "jacob.smith@example.com"),
            new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
            new Person("Ethan", "Williams", "ethan.williams@example.com"),
            new Person("Emma", "Jones", "emma.jones@example.com"),
            new Person("Michael", "Brown", "michael.brown@example.com"));
	
	
	@SuppressWarnings("unchecked")
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
                
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText(null);
                alert.setContentText(addEmail.getText());

                alert.showAndWait();
                
                addFirstName.clear();
                addLastName.clear();
                addEmail.clear();
            }
        });
        
        HBox hb = new HBox();
        
        hb.getChildren().addAll(addFirstName, addLastName, addEmail, addButton);
        hb.setSpacing(3);
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(hotelModelTable, hb);
		
		BorderPane root = new BorderPane();
		//root.setCenter(hotelModelTable);
		Scene scene = new Scene(new Group());
		((Group) scene.getRoot()).getChildren().addAll(vbox);
		
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
