import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Jfx extends Application{
    @Override
    public void start(Stage stage){
        //create label
        Label message=new Label("Welcome JavaFX!");

        //create layout
        StackPane root=new StackPane();

        root.getChildren().add(message);

        //create scene
        Scene scene=new Scene(root,300,200);
        stage.setScene(scene);
        stage.setTitle("My firstJavaFX Application");

        //display window 
        stage.show();
    }
    public static void main(String [] args){
        launch(args);
    }
}