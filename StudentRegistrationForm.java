import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StudentRegistrationForm extends Application {
    @Override
    public void start(Stage stage){
        //main border
        BorderPane root=new BorderPane();
        root.getStyleClass().add("root");
        //top region
        Label title=new Label("STUDENT REGISTRATION FORM");
        HBox top=new HBox(title);
        top.setAlignment(Pos.CENTER);
        top.setPadding(new Insets(20));

        root.setTop(top);

        //Center region :GridPane
        GridPane grid=new GridPane();

        grid.setPadding(new Insets(25));
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setAlignment(Pos.CENTER);

        //Student details fields
        TextField studentId=new TextField();
        TextField firstName=new TextField();
        TextField lastName=new TextField();
        TextField email=new TextField();
        TextField phone= new TextField();

        ComboBox<String> gender=new ComboBox<>();
        gender.getItems().addAll("Male", "Female");
        gender.setPromptText("Select Gender");

        DatePicker dob=new DatePicker();
        dob.setPromptText("Date of Birth");

        //labels
        grid.add(new Label("Student ID:"), 0, 0);
        grid.add(studentId, 1, 0);

        grid.add(new Label("First Name:"), 0, 1);
        grid.add(firstName, 1, 1);

        grid.add(new Label("Last Name:"),0, 2);
        grid.add(lastName, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(email,1 ,3);

        grid.add(new Label("Phone Number:"),0,4);
        grid.add(phone,1,4);

        grid.add(new Label("Gender:"),0,5);
        grid.add(gender,1,5);

        grid.add(new Label("Date of Birth:"),0,6);
        grid.add(dob,1,6);

        //Buttons
        Button register =new Button("Register");
        Button clear =new Button("Clear");

        HBox buttons = new HBox(15, register, clear);
        buttons.setAlignment(Pos.CENTER);

        grid.add(buttons, 1, 7);

        root.setCenter(grid);

        //Bottom regions
        Label status=new Label("Please enter student details.");
        status.getStyleClass().add("status");

        HBox bottom=new HBox(status);
        bottom.setAlignment(Pos.CENTER);
        bottom.setPadding(new Insets(20));

        root.setBottom(bottom);

        //Register button action
        register.setOnAction(e->{
            if(studentId.getText().isEmpty() || firstName.getText().isEmpty() || lastName.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || gender.getValue()==null || dob.getValue()==null) {
                status.setText("Error:Please fill in all fields.");
                status.getStyleClass().remove("success");
                status.getStyleClass().add("error");
            }
            else if(!email.getText().contains("@")){
                status.setText("Error:Please enter valid email address.");
                status.getStyleClass().remove("success");
                status.getStyleClass().add("error");

            }
            else{
                status.setText("Registration successful!");
                status.getStyleClass().remove("error");
                status.getStyleClass().add("success");
            }
        });
        //Clear butto action
        
        clear.setOnAction(event -> {

            System.out.println("Clear button clicked!");

            studentId.setText("");
            firstName.setText("");
            lastName.setText("");
            email.setText("");
            phone.setText("");

            gender.getSelectionModel().clearSelection();
            gender.setPromptText("Select Gender");

            dob.setValue(null);
            dob.getEditor().clear();

            status.setText("Form cleared. Enter new details.");

            status.getStyleClass().removeAll("error", "success");
        });

        //Scene and style
        Scene scene=new Scene(root, 600, 550);
        scene.getStylesheets().add(
            getClass().getResource("/style.css").toExternalForm()
        );

        stage.setTitle("Student Registration");
        stage.setScene(scene);
        stage.show();

    }
    public static void main (String [] args){
        launch(args);
    }
}