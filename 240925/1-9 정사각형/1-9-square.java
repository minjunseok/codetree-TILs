import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {
                
                if(cnt < 9 && cnt >= 0) {

                    
                    cnt++;

                    System.out.print(cnt);

                    
                    

                } else {

                    cnt -= 8;

                    System.out.print(cnt);

                }
                

                
            }

            System.out.println();

        }

    }
}