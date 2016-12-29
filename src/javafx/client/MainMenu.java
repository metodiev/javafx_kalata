package javafx.client;


import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.InnerShadowBuilder;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextBuilder;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class MainMenu extends Application {

	/*
	 * public Stage getRestaurantLogo(){ RestaurantLogo logo = new
	 * RestaurantLogo(); return logo.getlogo(); }
	 */

	
	@SuppressWarnings("null")
	public HBox getHbox(){
		HBox hbox = new HBox();

	    Label label1 = new Label("Search");
	    label1.setTextFill(Color.web("#0076a3"));
//	    label1.setWrapText(true);
	    Label label2 = new Label("Name:");
	    TextField textField = new TextField ();

	    GridPane grid = new GridPane();
	    grid.setVgap(4);
	    grid.setHgap(10);
	    grid.setPadding(new Insets(5, 5, 5, 5));
	    grid.add(new Label("To: "), 0, 0);
	   // grid.add(notification, 1, 0);
	   
	    
	     hbox.setSpacing(10);
	   hbox.getChildren().add((label1));
	   hbox.setSpacing(10);
	    hbox.getChildren().add(grid);
	    hbox.setSpacing(10);
	    hbox.getChildren().addAll((label2));
	    
	    
	    
	   //add button
	    Button btn = new Button();
	    final Label lbl = new Label();

	 
	    lbl.setLayoutX(70);
	    lbl.setLayoutY(150);

	    btn.setLayoutX(100);
	    btn.setLayoutY(100);
	    btn.setText("Hello, World!");

	    hbox.getChildren().add(btn);
	    
	    
	    //radio buttons
	    final ToggleGroup group = new ToggleGroup();

	    
	    RadioButton rb1 = new RadioButton("A");
	    rb1.setToggleGroup(group);
	    rb1.setUserData("A");

	    RadioButton rb2 = new RadioButton("B");
	    rb2.setToggleGroup(group);
	    rb2.setUserData("B");

	    RadioButton rb3 = new RadioButton("C");
	    rb3.setToggleGroup(group);
	    rb3.setUserData("C");
	    
	    hbox.getChildren().add(rb1);
	    hbox.getChildren().add(rb2);
	    hbox.getChildren().add(rb3);
	 
	    
	    //add checkbox
	    final CheckBox cb = new CheckBox("checkBox");
        final Tooltip tooltip = new Tooltip("$ tooltip");
        tooltip.setFont(new Font("Arial", 16));
        cb.setTooltip(tooltip);
        
        hbox.getChildren().add(cb);
	    
        
        //add dropdown menu
        
        Rectangle rect = new Rectangle(150, 30);
        final Label label = new Label("Hello");
        
       // label.setStyle("-fx-font: 25 arial;");
        label.setStyle("-fx-border-color: black;");
        label.setLayoutX(40);

        rect.setStroke(Color.BLUE);
        rect.setStrokeWidth(3);
        rect.setFill(Color.WHITE);

        final String[] greetings = new String[] { "A", "B", "C", "D", "E" };
        final ChoiceBox<String> cbCHoice = new ChoiceBox<String>(
            FXCollections.observableArrayList("a", "b", "c", "d", "e"));

        

        cbCHoice.setTooltip(new Tooltip("Select the language"));
        cbCHoice.setValue("English");
        
        hbox.getChildren().add(cbCHoice);
        
        
        //gettextfield
        
        GridPane grid2 = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        

        final TextField name = new TextField();
        name.setPromptText("Enter your first name.");
        name.setPrefColumnCount(10);
        name.getText();
        GridPane.setConstraints(name, 0, 0);
        grid.getChildren().add(name);
        
        hbox.getChildren().add(name);
        
        
 //gettextfield2
        
        GridPane grid3 = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        

        final TextField textField3 = new TextField();
        textField3.setPromptText("Enter your first name.");
        textField3.setPrefColumnCount(10);
        textField3.getText();
        GridPane.setConstraints(textField3, 0, 0);
        grid.getChildren().add(textField3);
        
        hbox.getChildren().add(textField3);
     
        //add border 
       /* String titleString = "Border title" ;
        Node content = null;
        
        Label title = new Label(" " + titleString + " ");
        title.getStyleClass().add("bordered-titled-title");
        StackPane.setAlignment(title, Pos.TOP_CENTER);

        StackPane contentPane = new StackPane();
        content.getStyleClass().add("bordered-titled-content");
        contentPane.getChildren().add(content);
        
        hbox.getStyleClass().add("bordered-titled-border");
        hbox.getChildren().addAll(title, contentPane);*/
        
        
        //add line break for text
        
        final StringProperty statusProperty = new SimpleStringProperty();

        InnerShadow iShadow = InnerShadowBuilder.create()
                .offsetX(3.5f)
                .offsetY(3.5f)
                .build();
        final Text status = TextBuilder.create()
            .effect(iShadow)
            .x(100)
            .y(50)
            .fill(Color.LIME)
            .font(Font.font(null, FontWeight.BOLD, 35))
            .translateY(50)
            .build();
        status.textProperty().bind(statusProperty);
        
        statusProperty.set("Line\nLine2\nLine");
        hbox.getChildren().add(status);
        
	    return hbox;
	}
	
	
	@Override
	// primarystage extends Windows class
	public void start(Stage primaryStage) throws Exception {

		// creating a Group object
		Group group = new Group();

		// Creating a Scene by passing the group object, height and width
		Scene scene = new Scene(group, 600, 300);

		/**
		 * Add Tab
		 */

		TabPane tabPane = new TabPane();

		BorderPane borderPane = new BorderPane();

		for (int i = 0; i < 5; i++) {
			
			if(i == 1){
			Tab tab = new Tab();
			tab.setText("Tab" + i);
			HBox hbox = new HBox();
			hbox.getChildren().add(new Label("Label" + i));
			hbox.setAlignment(Pos.CENTER);
			tab.setContent(getHbox());
			tabPane.getTabs().add(tab);
			}else{
				Tab tab = new Tab();
				tab.setText("Tab" + i);
				HBox hbox = new HBox();
				hbox.getChildren().add(new Label("Label" + i));
				hbox.setAlignment(Pos.CENTER);
				tab.setContent(hbox);
				tabPane.getTabs().add(tab);
			}

		}

		// bind to take available space
		borderPane.prefHeightProperty().bind(scene.heightProperty());
		borderPane.prefWidthProperty().bind(scene.widthProperty());

		borderPane.setCenter(tabPane);
		group.getChildren().add(borderPane);

		/**
		 * end tab
		 */

		// setting color to the scene
		scene.setFill(Color.WHITE);
	
		// Setting the title to Stage.
		primaryStage.setTitle("Restaurant Ratatouille ");

		// Adding the scene to Stage
		primaryStage.setScene(scene);

		// Displaying the contents of the stage
		primaryStage.show();
		
	}

	public static void main(String args[]) {
		launch(args);
	}
}