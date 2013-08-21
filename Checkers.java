/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Paige
 */
public class Checkers extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        /*
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        */
        
        //StackPane root = new StackPane();
        //root.getChildren().add(btn);
        
        primaryStage.setTitle("Simple Checkers");
        
        //Gridpane creation
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        //initial window set up
        Text introText = new Text("Welcome to Simple Checkers!");
        introText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 28));
        grid.add(introText, 0, 0, 1, 1);
        grid.setHalignment(introText, HPos.CENTER);
        grid.setGridLinesVisible(true);
        
        //buttons
        HBox buttonhbox = new HBox();
        buttonhbox.setPadding(new Insets(15, 12, 15, 12));
        buttonhbox.setSpacing(10);
        
        Button newGameBtn = new Button("New Game");
        newGameBtn.setPrefWidth(150);
        Button aboutBtn = new Button("About");
        aboutBtn.setPrefWidth(150);
        Button quitBtn = new Button("Quit");
        quitBtn.setPrefWidth(150);
        buttonhbox.getChildren().addAll(newGameBtn, aboutBtn, quitBtn);
        buttonhbox.setAlignment(Pos.CENTER);
        grid.add(buttonhbox, 0, 1);
        
        Scene scene = new Scene(grid, 600, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
