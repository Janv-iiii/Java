import java.util.*;
public class calc_sum_using_function {
    public static int sum_of_two_numbers(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = sum_of_two_numbers(num1, num2);
        System.out.println("Addition of two numbers is:" +sum);
    }
}
