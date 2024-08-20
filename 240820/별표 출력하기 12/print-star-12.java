import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i = 0; i < n; i++) {


            System.out.print("* ");

           for(int j = 0; j < n; j++) {

            if(i > 0 && j % 2 == 0 && j < i) {

                System.out.print("* ");

            } else {

                System.out.print(" ");
                
                            }


           }

            System.out.println();


        }
    }
}