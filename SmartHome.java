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
import javafx.scene.Group;

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
       
        GridPane  gridPane = new GridPane(); 
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5,13.5,14.5));
        gridPane.setHgap(10);
        gridPane.setVgap(6);
  Rectangle rectangle = new Rectangle();
       rectangle.setX(100);
       rectangle.setY(40);
       rectangle.setWidth(200);
       rectangle.setHeight(220);
       rectangle.setFill(Color.GREY);
       rectangle.setStroke(Color.BLACK);
       rectangle.setStrokeWidth(2);

       Rectangle rectangle1 = new Rectangle();
       rectangle1.setX(300);
       rectangle1.setY(160);
       rectangle1.setWidth(200);
       rectangle1.setHeight(80);
       rectangle1.setFill(Color.GREY);
       rectangle1.setStroke(Color.BLACK);
       rectangle1.setStrokeWidth(2);

        Rectangle rectangle2 = new Rectangle();
         rectangle2.setX(300);
       rectangle2.setY(40);
       rectangle2.setWidth(100);
       rectangle2.setHeight(120);
       rectangle2.setFill(Color.GREY);
       rectangle2.setStroke(Color.BLACK);
       rectangle2.setStrokeWidth(2);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setX(400);
       rectangle3.setY(40);
       rectangle3.setWidth(100);
       rectangle3.setHeight(120);
       rectangle3.setFill(Color.GREY);
       rectangle3.setStroke(Color.BLACK);
       rectangle3.setStrokeWidth(2);

        Rectangle rectangle4 = new Rectangle();
       rectangle4.setX(500);
       rectangle4.setY(40);
       rectangle4.setWidth(120);
       rectangle4.setHeight(200);
       rectangle4.setFill(Color.GREY);
       rectangle4.setStroke(Color.BLACK);
       rectangle4.setStrokeWidth(2);
       
       
        Rectangle rectangle5 = new Rectangle();
        rectangle5.setX(300);
       rectangle5.setY(240);
       rectangle5.setWidth(160);
       rectangle5.setHeight(140);
       rectangle5.setFill(Color.GREY);
       rectangle5.setStroke(Color.BLACK);
       rectangle5.setStrokeWidth(2);
       
       Rectangle rectangle6 = new Rectangle();
      rectangle6.setX(460);
       rectangle6.setY(240);
       rectangle6.setWidth(160);
       rectangle6.setHeight(140);
       rectangle6.setFill(Color.GREY);
       rectangle6.setStroke(Color.BLACK);
       rectangle6.setStrokeWidth(2);
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
      

      gridPane.add(button1,0,5);
      gridPane.add(button2,0,6);
      gridPane.add(button3,0,7);

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

      gridPane.add(button4,1,5);
      gridPane.add(button5,1,6);
      gridPane.add(button6,1,7);

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


      gridPane.add(button7,2,5);
      gridPane.add(button8,2,6);
      gridPane.add(button9,2,7);

      Pane pane = new Pane();
      Group group = new Group();
      pane.getChildren().addAll(rectangle,rectangle1,rectangle2,rectangle3,rectangle4,rectangle5,rectangle6);
      group.getChildren().addAll(pane,gridPane);

    Scene scene = new Scene(group,800,600);
    
    primaryStage.setTitle("My SmartHome"); // Set the stage title
    primaryStage.setResizable(false);
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display  
    }

}