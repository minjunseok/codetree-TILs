import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();

     for(int i = 0; i < n; i++) {

        for(int l = 0; l < n; l++){
            System.out.print("*");
        }
            System.out.println();
        
     }

            System.out.println();

     for(int j = 0; j < n; j++) {

        for(int k = 0; k < n; k++) {
            System.out.print("*");
        }
            System.out.println();
     }
           
    }
}