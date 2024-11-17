import java.util.Scanner;

public class prob2 {

    






    public static void main(String[] args) {

        
        Scanner ss=new Scanner(System.in);
            int []arr=new int[10];
            int count=0;
            System.out.println("enter 10 number to store in an array ");
            for(int i=0;i<arr.length;i++){
                arr[i]=ss.nextInt();
            }

            for(int i=0;i<arr.length;i++){
                for(int j=1;j<=arr.length;j++){
                    if(arr[i]%j==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println(arr[i]+" is a prime no");
                }
                count=0;
            }
            




    }
    
}
