package javafx.ui;

import java.sql.SQLException;

import javafx.application.Application ;
import javafx.database.PersonDataAccessor;
import javafx.model.Person;
import javafx.scene.control.TableView ;
import javafx.scene.control.TableColumn ;
import javafx.scene.control.cell.PropertyValueFactory ;
import javafx.scene.layout.BorderPane ;
import javafx.scene.layout.HBox;
import javafx.scene.Scene ;
import javafx.stage.Stage ;

public class PersonTableApp extends Application {
    private PersonDataAccessor dataAccessor ;
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
    	//String driverClassName, String dbURL, String user, String password
    	
    	/**
    	 * 
    	 * String url = "jdbc:mysql://localhost:3305/javabase";
String username = "java";
String password = "password";
    	 */
    	String driverClassName= "com.mysql.jdbc.Driver";
    	String dbUrl = "jdbc:mysql://127.0.0.1:3306/hotel";
    	String user = "root";
    	String password = "";
    	
        dataAccessor = new PersonDataAccessor(driverClassName, dbUrl, user, password); // provide driverName, dbURL, user, password...

        TableView<Person> personTable = new TableView<>();
        TableColumn<Person, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Person, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        TableColumn<Person, String> emailCol = new TableColumn<>("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        personTable.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        personTable.getItems().addAll(dataAccessor.getPersonList());
        	
   
        BorderPane root = new BorderPane();
        root.setCenter(personTable);
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

    
    public HBox getPersonDetails()  throws Exception {
    	String driverClassName= "com.mysql.jdbc.Driver";
    	String dbUrl = "jdbc:mysql://127.0.0.1:3306/hotel";
    	String user = "root";
    	String password = "";
    	
        dataAccessor = new PersonDataAccessor(driverClassName, dbUrl, user, password); // provide driverName, dbURL, user, password...

        TableView<Person> personTable = new TableView<>();
        TableColumn<Person, String> firstNameCol = new TableColumn<>("First Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Person, String> lastNameCol = new TableColumn<>("Last Name");
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        TableColumn<Person, String> emailCol = new TableColumn<>("Email");
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        personTable.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        personTable.getItems().addAll(dataAccessor.getPersonList());
          HBox hboxPerson = new HBox();
       
        hboxPerson.getChildren().add(personTable);
        return hboxPerson;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}