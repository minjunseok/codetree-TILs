import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            
            for(int l = n; l > i; l--) {

            System.out.print(" " + " ");

            }

            for(int k = 1; k < 2 * i; k++) {

                System.out.print("*" + " ");


            }

             for(int j = 0; j < i; j++) {

            System.out.print(" " + " ");

            }



            System.out.println();

        }
    }
}