import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Insets;

public class RegistrationLayout extends Application{
    @Override
    public void start(Stage stage){
        BorderPane root =new BorderPane();

        Label title = new Label("Student Registration Form");

        root.setTop(title);

        GridPane grid=new GridPane();

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));


        TextField FirstName=new TextField();
        TextField LastName =new TextField();
        TextField email=new TextField();
        TextField phone=new TextField();

        ComboBox<String> gender=new ComboBox<>();
        gender.getItems().addAll("Male","Female");

        Button register=new Button("Register");
        Button clear=new Button("Clear");
        Button exit=new Button("Exit");
        HBox buttons=new HBox(10);
        buttons.getChildren().addAll(register,clear,exit);

        Label message=new Label("READY");

        register.setOnAction(e->{
            String fn=FirstName.getText();
            String ln=LastName.getText();
            String em=email.getText();
            String p=phone.getText();
            String g=gender.getValue();

            if(fn.isEmpty() || ln.isEmpty() || em.isEmpty() || p.isEmpty() || g==null){
                message.setText("Please fill in all the fileds!");
                return;
            }
            message.setText("Registration successfull!");
        });



        clear.setOnAction(e->{
            FirstName.clear();
            LastName.clear();
            email.clear();
            phone.clear();
            gender.setValue(null);

            message.setText("Form Cleared!");

        });

        exit.setOnAction(e->{
            stage.close();
        });

         
        grid.add(new Label("First Name:"),0,0);
        grid.add(FirstName,1,0);
        grid.add(new Label("Last Name:"),0,1);
        grid.add(LastName,1,1);
        grid.add(new Label("Email:"),0,2);
        grid.add(email,1,2);
        grid.add(new Label("Phone:"),0,3);
        grid.add(phone,1,3);
        grid.add(new Label("Gender:"),0,4);
        grid.add(gender,1,4);
        grid.add(message,0,5);
        grid.add(buttons,0,6);
        
        root.setCenter(grid);

        Label status=new Label("Ready to code again in java😎😎");
        root.setBottom(status);

        Scene scene=new Scene(root,500,400);
        stage.setScene(scene);
        stage.setTitle("Registration Layout");

        stage.show();
    }

    public static void main(String [] args){
        launch(args);
    }
}