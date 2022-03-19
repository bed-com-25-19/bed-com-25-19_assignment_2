import javafx.application.Application;
// import javafx.event.ActionOnEvent;
import javafx.event.EventHandler;
 import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;

public class SmartHome extends Application{
   Boolean room1IsOn=false;
   Boolean room2IsOn=false;
   Boolean room3IsOn=false;
   Boolean room4IsOn=false;
   Boolean room5IsOn=false;
   Boolean room6IsOn=false;
   Boolean room7IsOn=false;
   
    @Override
    public void start(Stage primaryStage){
       
        GridPane  pane = new GridPane(); 
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5,13.5,14.5));
        pane.setHgap(10);
        pane.setVgap(6);
       Rectangle rectangle = new Rectangle();
       rectangle.setWidth(100);
       rectangle.setHeight(100);
       rectangle.setFill(Color.GREY);
       rectangle.setStroke(Color.BLACK);
       rectangle.setStrokeWidth(2);

       StackPane stackPane = new StackPane();
       stackPane.getChildren().addAll(rectangle,new Label("Room 1"));

       Rectangle rectangle1 = new Rectangle();
       rectangle1.setWidth(90);
       rectangle1.setHeight(30);
       rectangle1.setFill(Color.GREY);
       rectangle1.setStroke(Color.BLACK);
       rectangle1.setStrokeWidth(2);
       
       StackPane stackPane1 = new StackPane();
       stackPane1.getChildren().addAll(rectangle1,new Label("Room 2"));

         Rectangle rectangle2 = new Rectangle();
       rectangle2.setWidth(50);
       rectangle2.setHeight(80);
       rectangle2.setFill(Color.GREY);
       rectangle2.setStroke(Color.BLACK);
       rectangle2.setStrokeWidth(2);
       
       StackPane stackPane2 = new StackPane();
       stackPane2.getChildren().addAll(rectangle2,new Label("Room 3"));

        Rectangle rectangle3 = new Rectangle();
       rectangle3.setWidth(50);
       rectangle3.setHeight(80);
       rectangle3.setFill(Color.GREY);
       rectangle3.setStroke(Color.BLACK);
       rectangle3.setStrokeWidth(2);
       
       StackPane stackPane3 = new StackPane();
       stackPane3.getChildren().addAll(rectangle3,new Label("Room 4"));

       Rectangle rectangle4 = new Rectangle();
       rectangle4.setWidth(50);
       rectangle4.setHeight(80);
       rectangle4.setFill(Color.GREY);
       rectangle4.setStroke(Color.BLACK);
       rectangle4.setStrokeWidth(2);
       
       StackPane stackPane4 = new StackPane();
       stackPane4.getChildren().addAll(rectangle4,new Label("Room 5"));

        Rectangle rectangle5 = new Rectangle();
       rectangle5.setWidth(90);
       rectangle5.setHeight(90);
       rectangle5.setFill(Color.GREY);
       rectangle5.setStroke(Color.BLACK);
       rectangle5.setStrokeWidth(2);
       
       StackPane stackPane5 = new StackPane();
       stackPane5.getChildren().addAll(rectangle5,new Label("Room 6"));

      Rectangle rectangle6 = new Rectangle();
       rectangle6.setWidth(90);
       rectangle6.setHeight(90);
       rectangle6.setFill(Color.GREY);
       rectangle6.setStroke(Color.BLACK);
       rectangle6.setStrokeWidth(2);
       
       StackPane stackPane6 = new StackPane();
       stackPane6.getChildren().addAll(rectangle6,new Label("Room 7")); 

        pane.add (stackPane,0,0);
        pane.add (stackPane1,1,0);
        pane.add (stackPane2,2,0);
        pane.add (stackPane3,3,0);
        pane.add (stackPane4,1,1);
        pane.add (stackPane5,1,2);
        pane.add (stackPane6,2,1);
      
      //Button defininsions
      Button button1 = new Button("AllRooms ON/OFF");

      button1.setOnAction(e->{
        if (room1IsOn){
          rectangle.setFill(Color.GREY);
          rectangle1.setFill(Color.GREY);
          rectangle2.setFill(Color.GREY);
          rectangle3.setFill(Color.GREY);
          rectangle4.setFill(Color.GREY);
          rectangle5.setFill(Color.GREY);
          rectangle6.setFill(Color.GREY);
          room1IsOn=false;
        }
        else{
           rectangle.setFill(Color.YELLOW);
           rectangle1.setFill(Color.GREEN);
           rectangle2.setFill(Color.ORANGE);
           rectangle3.setFill(Color.ORANGE);
           rectangle4.setFill(Color.YELLOW);
           rectangle5.setFill(Color.RED);
           rectangle6.setFill(Color.YELLOW);
          room1IsOn=true;
        }
      });

      Button button2 = new Button("Rooms1&2ON/OFF");
      button2.setOnAction(e->{
        if (room1IsOn){
          rectangle.setFill(Color.GREY);
          rectangle1.setFill(Color.GREY);
          room1IsOn=false;
        }
        else{
           rectangle.setFill(Color.YELLOW);
           rectangle1.setFill(Color.GREEN);
          room1IsOn=true;
        }
      });
      Button button3 = new Button("Room1 ON/OFF");
      button3.setOnAction(e->{
        if (room1IsOn){
          rectangle.setFill(Color.GREY);
          room1IsOn=false;
        }
        else{
           rectangle.setFill(Color.YELLOW);
          room1IsOn=true;
        }
      });
      

      pane.add(button1,0,5);
      pane.add(button2,0,6);
      pane.add(button3,0,7);

      //Button definition
      Button button4 =new Button ("Room2 ON/OFF");
      button4.setOnAction(e->{
        if (room2IsOn){
          rectangle1.setFill(Color.GREY);
          room2IsOn=false;
        }
        else{
           rectangle1.setFill(Color.GREEN);
          room2IsOn=true;
        }
      });

      Button button5 =new Button ("Room3 ON/OFF");
      button5.setOnAction(e->{
        if (room3IsOn){
          rectangle2.setFill(Color.GREY);
          room3IsOn=false;
        }
        else{
           rectangle2.setFill(Color.ORANGE);
          room3IsOn=true;
        }
      });

      Button button6 =new Button ("Room4 ON/OFF");
      button6.setOnAction(e->{
        if (room4IsOn){
          rectangle3.setFill(Color.GREY);
          room4IsOn=false;
        }
        else{
           rectangle3.setFill(Color.ORANGE);
          room4IsOn=true;
        }
      });

      pane.add(button4,1,5);
      pane.add(button5,1,6);
      pane.add(button6,1,7);

      //Button definition
      Button button7 =new Button ("Room5 ON/OFF");
        button7.setOnAction(e->{
        if (room5IsOn){
          rectangle4.setFill(Color.GREY);
          room5IsOn=false;
        }
        else{
           rectangle4.setFill(Color.YELLOW);
          room5IsOn=true;
        }
      });

      Button button8 =new Button ("Room6 ON/OFF");
        button8.setOnAction(e->{
        if (room6IsOn){
          rectangle5.setFill(Color.GREY);
          room6IsOn=false;
        }
        else{
           rectangle5.setFill(Color.RED);
          room6IsOn=true;
        }
      });
      Button button9 =new Button ("Room7 ON/OFF");
        button9.setOnAction(e->{
        if (room7IsOn){
          rectangle6.setFill(Color.GREY);
          room7IsOn=false;
        }
        else{
           rectangle6.setFill(Color.YELLOW);
          room7IsOn=true;
        }
      });


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