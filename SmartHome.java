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
import javafx.scene.layout.*;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.shape.Line;

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
       
        Pane  pane = new Pane(); 
        
      
  Rectangle rectangle = new Rectangle();
       rectangle.setWidth(200);
       rectangle.setHeight(220);
       rectangle.setFill(Color.GREY);
       rectangle.setStroke(Color.BLACK);
       rectangle.setStrokeWidth(2);
       StackPane stackpane = new StackPane();
       stackpane.setPadding(new Insets(39,0,0,100));
       stackpane.getChildren().addAll(rectangle, new Label("Room1"));
       

       Rectangle rectangle1 = new Rectangle();
       rectangle1.setWidth(200);
       rectangle1.setHeight(80);
       rectangle1.setFill(Color.GREY);
       rectangle1.setStroke(Color.BLACK);
       rectangle1.setStrokeWidth(2);
       StackPane stackpane1 = new StackPane();
       stackpane1.setPadding(new Insets(159,0,0,300));
       stackpane1.getChildren().addAll(rectangle1, new Label("Room2"));

       Rectangle rectangle2 = new Rectangle();
       rectangle2.setWidth(100);
       rectangle2.setHeight(120);
       rectangle2.setFill(Color.GREY);
       rectangle2.setStroke(Color.BLACK);
       rectangle2.setStrokeWidth(2);
       StackPane stackpane2 = new StackPane();
       stackpane2.setPadding(new Insets(39,0,0,300));
       stackpane2.getChildren().addAll(rectangle2, new Label("Room3"));

      Rectangle rectangle3 = new Rectangle();
        rectangle3.setX(400);
       rectangle3.setY(40);
       rectangle3.setWidth(100);
       rectangle3.setHeight(120);
       rectangle3.setFill(Color.GREY);
       rectangle3.setStroke(Color.BLACK);
       rectangle3.setStrokeWidth(2);
       StackPane stackpane3 = new StackPane();
       stackpane3.setPadding(new Insets(39,0,0,400));
       stackpane3.getChildren().addAll(rectangle3, new Label("Room4"));

        Rectangle rectangle4 = new Rectangle();
       rectangle4.setX(500);
       rectangle4.setY(40);
       rectangle4.setWidth(120);
       rectangle4.setHeight(200);
       rectangle4.setFill(Color.GREY);
       rectangle4.setStroke(Color.BLACK);
       rectangle4.setStrokeWidth(2);
       StackPane stackpane4 = new StackPane();
       stackpane4.setPadding( new Insets(39,0,0,500));
       stackpane4.getChildren().addAll(rectangle4, new Label("Room5"));
       
        Rectangle rectangle5 = new Rectangle();
        rectangle5.setX(300);
       rectangle5.setY(240);
       rectangle5.setWidth(160);
       rectangle5.setHeight(140);
       rectangle5.setFill(Color.GREY);
       rectangle5.setStroke(Color.BLACK);
       rectangle5.setStrokeWidth(2);
       StackPane stackpane5 = new StackPane();
       stackpane5.setPadding( new Insets(240,0,0,300));
       stackpane5.getChildren().addAll(rectangle5, new Label("Room6"));
       
       Rectangle rectangle6 = new Rectangle();
      rectangle6.setX(460);
       rectangle6.setY(240);
       rectangle6.setWidth(160);
       rectangle6.setHeight(140);
       rectangle6.setFill(Color.GREY);
       rectangle6.setStroke(Color.BLACK);
       rectangle6.setStrokeWidth(2);
       StackPane stackpane6 = new StackPane();
       stackpane6.setPadding(new Insets(240,0,0,460));
       stackpane6.getChildren().addAll(rectangle6, new Label("room7"));
      

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
      
      VBox vbox = new VBox();
      vbox.setSpacing(20);
      vbox.setAlignment(Pos.CENTER);
      vbox.getChildren().addAll(button1, button2, button3);

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

      VBox vbox1 = new VBox();
      vbox1.setSpacing(20);
      vbox1.setAlignment(Pos.CENTER);
      vbox1.getChildren().addAll(button4, button5, button6);

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


      VBox vbox2 = new VBox();
      vbox2.setSpacing(20);
      vbox2.setAlignment(Pos.CENTER);
      vbox2.getChildren().addAll(button7, button8, button9);

      HBox hbox = new HBox();
      hbox.setSpacing(50);
      hbox.setPadding(new Insets(450,0,0,225));
      hbox.getChildren().addAll(vbox, vbox1, vbox2);

      Line line1 = new Line();
      line1.setStrokeWidth(5);
      line1.setStartX(180);
      line1.setEndX(280);
      line1.setStartY(257);
      line1.setEndY(257);

      Line line2 = new Line();
      line2.setStrokeWidth(5);
      line2.setStartX(330);
      line2.setEndX(360);
      line2.setStartY(240);
      line2.setEndY(240);

       Line line3 = new Line();
      line3.setStrokeWidth(5);
      line3.setStartX(330);
      line3.setEndX(360);
      line3.setStartY(160);
      line3.setEndY(160);

      Line line4 = new Line();
      line4.setStrokeWidth(5);
      line4.setStartX(430);
      line4.setEndX(460);
      line4.setStartY(160);
      line4.setEndY(160);

      Line line5 = new Line();
      line5.setStrokeWidth(5);
      line5.setStartX(470);
      line5.setEndX(490);
      line5.setStartY(240);
      line5.setEndY(240);

      Line line6 = new Line();
      line6.setStrokeWidth(5);
      line6.setStartX(300);
      line6.setEndX(300);
      line6.setStartY(170);
      line6.setEndY(210);

      Line line7 = new Line();
      line7.setStrokeWidth(5);
      line7.setStartX(500);
      line7.setEndX(500);
      line7.setStartY(170);
      line7.setEndY(210);

      pane.getChildren().addAll(hbox,stackpane,stackpane1,stackpane2,stackpane3,stackpane4,stackpane5,stackpane6
                ,line1,line2,line3,line4,line5,line6,line7);  
    Scene scene = new Scene(pane,800,600);
    
    primaryStage.setTitle("My SmartHome"); // Set the stage title
    primaryStage.setResizable(false);
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.getIcons().add(new Image("Imbwah.jpg"));
    primaryStage.show(); // Display  
    }

}