import java.util.Scanner;

public class FirstlLargest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int arr[]=new int[5];
        System.out.println("Enter array ");
        int i;
       for(i=0;i< arr.length;i++){
        arr[i]=sc.nextInt();
       }
       int max=arr[0];
       for(i=1;i<5;i++){
           if(max<arr[i]){
               max=arr[i];
           }
       }
        System.out.println("max value is = "+max);
    }
}
