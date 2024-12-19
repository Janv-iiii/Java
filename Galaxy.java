import java.util.*;
public class Galaxy {
    public static void main(String[] args) {
        System.out.println("Enter a number which you want to check if it is even or odd:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("The number entered is EVEN");
        }
        else{
            System.out.println("The number enetred is ODD");
        }
    }
}
