public class half_pyramid {
    public static void main(String[] args) {
        System.out.println("We are going to print a half star pyramid:");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}