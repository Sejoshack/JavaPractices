import javafx.application.APllicaton;
import javafx.stage.Stage;
import javafx.scene.Scene;
import jvafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.collections.*;
import javafx.beans.property.*;

public class StudentTableManager extends Application{
    @Override
    public void start(Stage stage){
        //create table 
        TableView<Student> table=new TableView<>();
        TableColumn<Student,Number> idColumn=newTableColumn<>("ID");
        TableColumn<Student, String> firstColumn=new TableColumn<>("First Name");
        TableColumn<Student, String> lastColumn=new TableColumn<>("Last Name");
        TableColumn<Student, String> genderColumn=new TableColumn<>("Gender");

        idColumn.setCellValueFactory(
            data->data.getValue().studentIdProperty()
        );
        firstColumn.setCellValueFactory(
            data->data.getValue().firstNameProperty()
        );
        lastColumn.setCellValueFactory(
             data->data.getValue().lastNameProperty()
        );
        genderColumn.setCellValueFactory(
            data->data.getValue().genderProperty()
        );

        table.getColumns().addAll(idColumn,firstColumn,lastColumn,genderColumn);

        //student data
        ObservableList<Student> students=FXCollections.observableArrayList();
        students.addAll(
            new Student(1,"John","Doe","Male"),
            new Student(2,"Mary","Jane","Female"),
            new Student(3,"Peter","PArker","Male"),
            new Student(4,"Alice","Johnson","Female")
        );

       
    }
    public static void main(String [] args){
        launch(args);
    }
}