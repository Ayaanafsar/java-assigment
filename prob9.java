import java.util.Scanner;

public class prob9 {
public static void main(String[] args) {
    Scanner ss =new Scanner(System.in);
    System.out.println("Enter no up to which you have to draw a fllyod triangle");
    int n=ss.nextInt();
    int k=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(k+"\t");
            k++;
        }
        
        System.out.println();
    }
}    
}
