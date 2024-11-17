import java.util.Scanner;

public class prob5 {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("enter no up to which you have to find fibonacci series");
        int num=ss.nextInt();
        int a=-1,b=1;
        int []arr=new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=a+b;
            a=b;
            b=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    
}
