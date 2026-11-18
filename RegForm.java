import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.scene.layout.*;

public class RegForm extends Application{
    @Override
    public void start(Stage stage){
        Label title=new Label("Student Registration Form!");
        
        TextField firstName=new TextField();
        firstName.setPromptText("First Name:");
        
        TextField lastName=new TextField();
        lastName.setPromptText("Last Name:");
        
        TextField email =new TextField();
        email.setPromptText("Email:");
        
        TextField phone=new TextField();
        phone.setPromptText("Phone:");
        
        ComboBox<String> gender=new ComboBox<>();
        gender.getItems().addAll("Male","Female");
        gender.setPromptText("Select Gender");
        
        DatePicker dob=new DatePicker();
        dob.setPromptText("Date of Birth");

        Button register =new Button("Register");
        Button clear=new Button("Clear");

        HBox buttons=new HBox(10);
        buttons.getChildren().addAll(register,clear);

        VBox root=new VBox(15);
        root.getChildren().addAll(title,firstName,lastName,email,phone,gender,dob,buttons);

        root.setPadding(new Insets(25));

        Scene scene =new Scene(root,500,400);
        stage.setScene(scene);
        stage.setTitle("Registration Form");
        stage.show();
    }
    
    public static void main (String [] args){
        launch(args);
    }
}