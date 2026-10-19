import java.util.*;

public class QuotientWithException {
    public static int quotient(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return num1/num2;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        try{
            int result = quotient(num1, num2);
            System.out.print(num1 + " / " + num2 + " = " + result);
        }catch (ArithmeticException ex){
            System.out.println("Exception: an integer cannot be divided by zero!");
        }

        System.out.println("Execution continues...");
    }


}
