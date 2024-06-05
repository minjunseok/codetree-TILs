import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        

        for(int i = 0; i < n; i++) {

            for (int l = n; l > i; l--) {

            System.out.print("*" + " ");


            }

            System.out.println();

        }

        for (int j = 1; j < n; j++) {

            for (int k = 0; k < j; k++) {

                System.out.print("*" + " ");

            }

            System.out.println("*" + " ");

        }

        }
}