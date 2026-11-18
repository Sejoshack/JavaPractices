//Student class
public class Student{
    private final IntegerProperty studentId=new SimpleIntegerProperty();
    private final StringProperty firstName =new SimpleStringProperty();
    private final StringProperty lastName=new SimpleStringProperty();
    private final StringProperty email=new SimpleStringProperty();
    private final StringProperty gender=new SimpleStringProperty();

    public Student(int id, String first, String last,String ema, String gender){
        this.studentId.set(id);
        this.firstName.set(first);
        this.lastName.set(last);
        this.email.set(ema);
        this.gender.set(gender);
    }

    public IntegerProperty studentIdProperty(){
      return studentId;
  
    }
    public StringProperty firstNameProperty(){
      return firstName;

    }
    public StringProperty lastNameProperty(){
      return lastName;

    }

    public StringProperty emailProperty(){
      return email;
    }

    public StringProperty genderProperty(){
      return gender;
    }
}
