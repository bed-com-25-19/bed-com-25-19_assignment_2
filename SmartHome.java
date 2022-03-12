import javafx.application.Application;
// import javafx.event.ActionOnEvent;
import javafx.event.EventHandler;
 import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;;
import javafx.scene.layout.BorderPane;
// import javafx.scene.paint.colour;
import javafx.scene.Scene;
// import javafx.scene. shape. Rectangles;
import javafx.stage.Stage;

public class SmartHome extends Application{
    @Override
    public void start(Stage primaryStage){
        // Label label = new Label("JavaFX");
        // pane.getChildren().add(label);
        GridPane  pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(12.5, 13.5,14.5,15.5));
        pane.setHgap(4);
        pane.setVgap(2);

        
        pane.add (new Label("Room 1"),0,0);
        pane.add (new Label("Room 2"),1,0);
        pane.add (new Label("Room 3"),2,0);
        pane.add (new Label("Room 4"),3,0);
        pane.add (new Label("Room 5"),1,1);
        pane.add (new Label("Room 6"),1,2);
        pane.add (new Label("Room 7"),2,1);
      
      //Button defininsions
      Button button1 = new Button("AllRooms ON/OFF");
      Button button2 = new Button("Rooms 1&2 ON/OFF");
      Button button3 = new Button("Room1 ON/OFF");

      pane.add(button1,0,5);
      pane.add(button2,0,6);
      pane.add(button3,0,7);

      //Button definition
      Button button4 =new Button ("Room2 ON/OFF");
      Button button5 =new Button ("Room3 ON/OFF");
      Button button6 =new Button ("Room4 ON/OFF");

      pane.add(button4,1,5);
      pane.add(button5,1,6);
      pane.add(button6,1,7);

      //Button definition
      Button button7 =new Button ("Room5 ON/OFF");
      Button button8 =new Button ("Room6 ON/OFF");
      Button button9 =new Button ("Room7 ON/OFF");


      pane.add(button7,2,5);
      pane.add(button8,2,6);
      pane.add(button9,2,7);

    Scene scene = new Scene(pane, 500,600);
    primaryStage.setTitle("My SmartHome"); // Set the stage title
    // Scene.setResizable(false);
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display  
    }

}