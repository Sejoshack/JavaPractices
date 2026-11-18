public class nestedfor{
    public static void main(String[]args){
        int a=5,b=5;
        for(int i=0;i<=a;i++){
            System.out.println("Outer:");
            for(int j=0;j<=b;j++){
                System.out.println("\tInner:");
            }
        }
        for (int x=1;x<=4;x++){//multiplication table
            for(int y=1;y<=4;y++){
                System.out.print(x*y+" ");
            }
            System.out.println();
        }
        //for-each loop
        String[] cars={"BMW","VOLVO","TOYOTA","VOLKSWAGON"};
        
        for(String car:cars){
            System.out.println(car);
        }
    }
}