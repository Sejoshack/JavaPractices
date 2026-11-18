import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.collections.*;
import javafx.beans.property.*;
import Student;

public class StudentTable extends Application{
    @Override
    public void start(Stage stage){
      //create table
      TableView <Student> table =new TableView<>();
      //columns
      TableColumn<Student,Number> idColumn=new TableColumn<>("Student ID");
      TableColumn<Student, String> firstColumn=new TableColumn<>("First Name");
      TableColumn<Student, String> lastColumn=new TableColumn<>("Last Name");
      TableColumn<Student, String> emailColumn=new TableColumn<>("Email");
      TableColumn<Student, String> genderColumn=new TableColumn<>("Gender");

      //connect columns to student properties
      idColumn.setCellValueFactory(
        data-> data.getValue().studentIdProperty()
      );

      firstColumn.setCellValueFactory(
        data -> data.getValue().firstNameProperty()
      );

      lastColumn.setCellValueFactory(
        data -> data.getValue().lastNameProperty()
      );

      emailColumn.setCellValueFactory(
        data -> data.getValue().emailProperty()
      );
      genderColumn.setCellValueFactory(
        data -> data.getValue().genderProperty()
      );

      //add columns to table
      table.getColumns().addAll(idColumn,firstColumn,lastColumn,emailColumn,genderColumn);

      //create student details
      ObservableList<Student> students=FXCollections.observableArrayList();

      students.addAll(
        new Student(1,"Jane","Doe","Janedoe@gmail.com","Female"),
        new Student(2,"Kevin","Kariuki","kkariuki@gmail.com","Male"),
        new Student(3,"Silvester","Maina","smaina@gmail.com","Male"),
        new Student(4,"Joseph","Muthini","jmuthini@gmail.com","Male"),
        new Student(5,"Silvester","Ndungu","sndungu@gmail.com","Male"),
        new Student(6,"Yvonne","Ndanu","Yndanu@gmail.com","Female")
      );

      table.setItems(students);

      VBox root=new VBox(10);
      root.getChildren().addAll(table);

      Scene scene =new Scene(root,500,400);

      stage.setScene(scene);
      stage.setTitle("Student Table");
      stage.show();


    }
    public static void main(String [] args){
        launch(args);
    }
}

