import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your first no.: ");
            int a=  in.nextInt();
        System.out.println("enter your second value: " );
            int b= in.nextInt();
        System.out.println("enter operator value: ");
            char operator = in.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a+b );
                break;
                case '-':
                System.out.println(a-b  );
                break;
                
        
            default:
            System.out.println("kuchh nahi hoga");
                break;
        }

    }
    
}
