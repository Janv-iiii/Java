import java.util.*;

public class Taking_input {
    public static void main(String[] args) {
        System.out.println("Now here we will take the input from the user:");
        //Input
        //To take input we use these commands and also we have to import one package then only we can take input from the user.
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println(name);
    }
}
