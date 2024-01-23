import java.util.Scanner;

public class Hcf {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the num1");
            int num1=sc.nextInt();
        System.out.println("Enter the num2");
            int num2=sc.nextInt();
            int i,Hcf=0;
            for(i=1;i<num1 ||i<num2;i++){
                if(num1 % i==0 && num2 %i==0){
                    Hcf=i;
                }
            }
                System.out.println("Hcf is = "+ Hcf);
    }
}
