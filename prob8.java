import java.util.Scanner;

public class prob8 {
    public static void main(String[] args) {
    Scanner ss=new Scanner(System.in);
    System.out.println("enter a for upto which you have to make the pyramid");
    int n=ss.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=i;j!=0;j--){
            System.out.print(j+"\t");
        }
        System.out.println();
    }






    }
    
    
}
