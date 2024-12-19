import java.util.*;
public class num {
    public static void main(String[] args) {
        System.out.println("Enter two numbers num1 and num2:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 == num2){
            System.out.println("Both the numbers are EQUAL");

        }
        else if(num1 > num2){
            System.out.println("NUM1 is greater than NUM2");
        }

        else{
            System.out.println("NUM2 is greater than NUM1");
        }
    }
}
