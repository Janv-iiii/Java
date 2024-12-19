import java.util.*;

public class table_of_a_no {
    public static void main(String[] args) {
        System.out.println("Enter a no. whose table you want to print:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n*i);
        }
    }
    
}
