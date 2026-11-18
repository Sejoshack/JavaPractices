import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class ControlsDemo extends Application{
    @Override
    public void start(Stage stage){
    
        Label title=new Label("Student Registration Form");

        TextField firstName=new TextField();
        firstName.setPromptText("First Name");

        TextField lastName=new TextField();
        lastName.setPromptText("Last Name");
        
        ComboBox<String> gender =new ComboBox<>();
        gender.getItems().addAll("Male", "Female");
        gender.setPromptText("Select Gender");

        Button register=new Button("Register");

        Label message=new Label();
        register.setOnAction(e->{
            if(firstName.getText().isEmpty() || lastName.getText().isEmpty() || gender.getValue()==null){
                message.setText("Please fill in all fields.");
                return;
            }
            String fn=firstName.getText();
            String ln=lastName.getText();
            String g=gender.getValue();
            message.setText("Student Registered: "+fn +" "+ln+".Gender: "+g);


        });

        VBox root=new VBox(10);
        root.getChildren().addAll(title,firstName,lastName,gender,register,message);

        Scene scene=new Scene(root,500,400);
        stage.setScene(scene);
        stage.setTitle("Control Demo");

        stage.show();
    }
    public static void main(String[] args){
        launch(args);

    }
}