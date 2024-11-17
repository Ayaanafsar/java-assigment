import java.util.Scanner;

public class prob4 {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        String str=ss.next();
        String str1=new String();
        for(int i=str.length()-1;i>=0;i--){

            str1=str1+str.charAt(i);
        }
    
       if(str.equals(str1)){
        System.out.println("palindrome string");
       }
      else{
        System.out.println("not a palindrome string");
      }
    }
    
}
