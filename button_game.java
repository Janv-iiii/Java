import java.util.*;
public class button_game {
    public static void main(String[] args) {
        System.out.println("Press any button:");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        //if(button == 1){
            //System.out.println("Hello");
        //}
        //else if(button == 2){
            //System.out.println("Bonjour");
        //}
        //else if(button == 3){
          //  System.out.println("Namaste");
        //}
        //else{
          //  System.out.println("Invalid Button");
        //}

        switch(button){
            case 1:
            System.out.println("Hello");
            break;

            case 2:
            System.out.println("Bonjour");
            break;

            case 3:
            System.out.println("Namaste");
            break;

            default:
            System.out.println("Invalid Choice");
            break;
        }
    }
}
