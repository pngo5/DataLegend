package GUI;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainMenu extends Application {

     Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Main Menu - Bus System");
    	
        FlowPane layout = new FlowPane();
        
        Button mainToLogin = new Button("Login Button");
        //Button switches scene for the user to login
        mainToLogin.setOnAction(e -> {
        	 Login lgn = new Login();
        	 try {
				lgn.start(window);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });
        
        // Creating Registration button in main menu.
        Button mainToRegistration = new Button("Registration Button"); 
        mainToRegistration.setOnAction(e -> {
        	RegistrationUI rg = new RegistrationUI();
        	try {
				rg.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        });

        
        layout.setHgap(25);
        layout.getChildren().addAll(mainToLogin, mainToRegistration);
        
        layout.setAlignment(Pos.CENTER);
        
        
        Scene scene = new Scene(layout, 400, 400);
        
        
        window.setScene(scene);
        window.show();
    }

}