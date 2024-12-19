public class half_right_star_pyramid {
    public static void main(String[] args) {
        System.out.println("We are going to print a half right star pyramid:");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-1;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
