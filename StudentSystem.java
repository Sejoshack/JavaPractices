import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class StudentSystem extends Application{
    @Override
    public void start(Stage stage){
        Label message=new Label("Welcome to student system!");
        StackPane root=new StackPane();
        root.getChildren().add(message);
        
        Scene scene=new Scene(root,500,400);
        stage.setScene(scene);
        stage.setTitle("Welcome to student management system");

        stage.show();
    }
    public static void main(String [] args){
        launch(args);
    }
}