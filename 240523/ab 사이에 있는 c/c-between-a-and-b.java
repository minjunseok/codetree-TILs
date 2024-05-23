import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean bl = true;
        int cnt = 0;
    
        for (int i = a; i <= b; i++) {

            if (cnt == 1) {

                break;

            }  else if (i % c == 0) {

                bl = true;
                cnt++;

            }  else if ((i % c != 0) && i == c || (c > b)) {

                bl = false;
                cnt++;
            }
        }

            if (bl == true) {

                  System.out.print("YES");

            } else if(bl == false) {

                  System.out.print("NO");
            }
              
    }

}