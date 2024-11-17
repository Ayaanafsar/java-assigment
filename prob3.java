import java.util.Scanner;

public class prob3 {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
      
        while(true){
            System.out.println("enter two numbers ");
            int a=ss.nextInt();
            int b=ss.nextInt();
            System.out.println("enter the operation you want to perform");
            String add=ss.next();
            while (true) {
                
            
        if(add.equals("+")){
            System.out.println(a+b);
            break;
        }
        else if(add.equals("-")){
            System.out.println(a-b);
            break;
        }
        else if(add.equals("*")){
            System.out.println(a*b);
            break;

        }

        else if(add.equals("/")){
            System.out.println(a/b);
            break;
        }
        
        else{
            System.out.println("enter a proper operation to perform");
        }
    }
    }
}
    
}
