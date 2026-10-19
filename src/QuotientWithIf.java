import java.util.*;

public class QuotientWithIf {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        if (num2 != 0){
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        }else{
            System.out.println("Divisor cannot be zero!");
        }
    }
}
