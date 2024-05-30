import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            
            for(int j = n; j > i; j--) {

                  for(int l = n; l > i; l--) {

                    System.out.print("*");

                  }

            System.out.print(" ");
            
            }
          

            System.out.println();
        }
    }
}