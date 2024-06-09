import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j <= i; j++) {

                System.out.print("*");
            }

            System.out.println();
            System.out.println();

            }

        for(int l = 1; l < n; l++) {

            for(int k = n; k > l; k--) {


                System.out.print("*");
            }

            System.out.println();
            System.out.println();
        }
    }
}