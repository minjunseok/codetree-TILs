import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
           i += 1;
           n += 1;
            for(int l = 0; l < i; l++) {
                
                System.out.print("*");

                // for(int j = 0; j < l; j++) {

                //     System.out.print("*");

                // }
            }

            System.out.println();
        }
    }
}