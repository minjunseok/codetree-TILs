import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    boolean cnt = false;

    
        

        if (c > b) {

        } else {
            
            for(int i = a; i <= b; i++) {

            if (i % c == 0) {

                cnt = true;

            } else {

                cnt = false;

            }

    }

       

    }

     if(cnt == true) {

            System.out.print("NO");

        } else if(cnt == false) {

            System.out.print("YES");

        }

    }
}