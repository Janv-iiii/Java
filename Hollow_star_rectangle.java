public class Hollow_star_rectangle {
    public static void main(String[] args) {
        System.out.println("We are going to print a hollow star rectangle:");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if( i==1 || j==1 || i==4 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
