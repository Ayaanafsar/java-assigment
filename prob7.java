import java.util.Scanner;

public class prob7 {
    public static void main(String[] args) {
    Scanner ss=new Scanner(System.in);
    System.out.println("enter a for upto which you have to make the pyramid");
    int n=ss.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+"\t");
        }
        System.out.println();
    }






    }
    
    
}
