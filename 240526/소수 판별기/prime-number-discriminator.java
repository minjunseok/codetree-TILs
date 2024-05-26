import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }

        if (cnt != 0) {
            System.out.print("C");
        } else {
            System.out.print("P");
        }
    }
}