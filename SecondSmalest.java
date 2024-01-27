import java.util.Scanner;

public class SecondSmalest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={ 1,5,3,4,5};
//        int arr[]=new int[5];
//        System.out.println("Enter element of array");
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        int min=arr[0];
//        for(int i=0;i< arr.length;i++){
//            if(min>arr[i]){
//                min =arr[i];
//            }
//        }
//        int max=Integer.MAX_VALUE;
//
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=min && arr[i]<max){
//               max=arr[i];
//            }
//        }
//        System.out.println("Second Largest Number is= "+max);



//        int first=Integer.MAX_VALUE,  second=Integer.MAX_VALUE ;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]<first){
//                second=first;
//                first=arr[i];
//            }
//            else if (second>arr[i]){
//                second=arr[i];
//            }
//        }
//        System.out.println(second);

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[1]);
    }
}
