import java.util. *;//imports the whole package
public class market{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String[] Goods={"good1:","good2:","good3:"};
        int units,price,total=0,sum=0;
        for(int i=0;i<3;i++){
            System.out.print(Goods[i]);
            price=scan.nextInt();
            System.out.print("Units:");
            units =scan.nextInt();
            total=price*units;
            sum+=total;
            
        }
        
        System.out.print(sum);
    }
    
}