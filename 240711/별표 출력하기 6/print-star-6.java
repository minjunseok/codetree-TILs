import java.util.*;

public class Main {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {

        for(int k = 0; k < 2 * i; k++) {

            System.out.print(" ");

        }


        for(int j = 0; j < (2 * n) - (2 * i) - 1; j++) {
            
            System.out.print("* ");

        }


    System.out.println();

    }

    for (int h = 0; h < n - 1; h++) {
            for (int j = 0; j < (n - h - 2) * 2; j++) {
                System.out.print(" ");
            }

            for (int l = 0; l < 3 + (2 * h); l++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }

    }
}