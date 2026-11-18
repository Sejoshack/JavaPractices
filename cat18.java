import java.util.*;
public class cat18{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int len;
        System.out.print("Enter the length of array:");
        len=sc.nextInt();
        int[] arr =new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int first = arr[0], second =arr[0];
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            }else if (num > second && num != first) {
                second = num;
            } 
        }
        System.out.println("second largest number is:"+second);
    }
}





