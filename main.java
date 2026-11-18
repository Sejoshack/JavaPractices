public class main{//main is the name of the file
    public static void main(String[]args){
        //this is my first java code
        System.out.print("Ilike pizza!\n");
        System.out.print("Hello world\n");
        //variables
        int num=5;
        int age=20;
        double nm=10.4567;
        int year=2025;
        char grade='A';
        boolean isStudent=false;
        boolean forSale=false;
        //primitive-int,double,char,boolean
        //referencive-string,array,object
        System.out.println(num);
        System.out.println(nm);
        System.out.println("The year is "+year);
        System.out.println("My grade is "+grade);
        System.out.println(isStudent);
        System.out.println(forSale);
          
        if(isStudent){
             System.out.println("You are a student");
        }else{
             System.out.println("You are not a student");
             
        }
        //refereencive-string
        String name="sejos muthini";
        System.out.println("Your name is "+name);
        System.out.println(name+" you are "+age +" years old.");
    }
}