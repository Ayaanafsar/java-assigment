import java.util.Scanner;

public class prob6 {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("enter the size of array");
        int num=ss.nextInt();
        int max=0,max2=0;
        int []arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=ss.nextInt();
        }
        for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
        }
      
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max && arr[i]>max2){
                max2=arr[i];

            }
        }
    
        System.out.println(max2+"is the second largest number");
    }
    
}
