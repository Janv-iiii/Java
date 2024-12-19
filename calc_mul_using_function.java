import java.util.*;
public class calc_mul_using_function {
    public static int mulTwoNumbers(int num1,int num2){
        int mul = num1 * num2;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int mul = mulTwoNumbers(num1, num2);
        System.out.println("Multiplication of two numbers is:" +mul);
        
    }
}
