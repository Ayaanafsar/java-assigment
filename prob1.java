import java.util.Scanner;

public class prob1 {

    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter a number to calculate a factorial");
        int num,fact=1,sum=0;
        num=ss.nextInt();
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        for(int t=fact;t>0;t=t/10){
            sum=sum+(t%10);
        }
        System.out.println(sum);
    }
}