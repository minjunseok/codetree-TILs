import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {


            for(int j = 1; j < i; j++) {

                System.out.print(" " + " ");
                            
                    }


            for(int l = 2 * n; l > 2 * i - 1; l--) {

                System.out.print("*" + " ");

            }

            

          

         System.out.println();

    }
}
}