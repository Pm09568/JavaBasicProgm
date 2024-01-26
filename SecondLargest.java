import java.util.Arrays;

public class SecondLargest {
    public static void main(String args[]){
        int arr[]={2,3,5,7,6,1};
//        Arrays.sort(arr);
//        int secMax=arr[arr.length-2];
//        System.out.println(secMax);

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);
    }
}
