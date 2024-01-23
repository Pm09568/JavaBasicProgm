import java.util.Scanner;

public class Lcm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=sc.nextInt();
        System.out.println("Enter the num2");
        int num2=sc.nextInt();
        int i,Lcf=0;
        int max=(num1>num2)?num1:num2;

        for(i=max;i<=num1*num2;i++){
            if(i % num1==0 && i %num2==0){
                Lcf=i;
            }
        }
        System.out.println("Lcf is = "+ Lcf);
    }
}
