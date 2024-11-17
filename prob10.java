import java.util.Scanner;

public class prob10 {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("enter a string and enter a key to searh");
        String str=ss.next();
        String key=ss.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i))==(key.charAt(0))){
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}
