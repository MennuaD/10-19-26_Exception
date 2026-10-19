import java.util.*;

public class QuotientWithMethod {
    public static int quotient(int num1, int num2){
        if(num2 == 0){
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }
        return num1/num2;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int result = quotient(num1, num2);
        System.out.print(num1 + " / " + num2 + " = " + result);
    }
}
