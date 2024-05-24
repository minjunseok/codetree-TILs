import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int div = n - 1;
    int cnt = 0;

    for(int i = 2; i <= div; i++) {

        if (n % i == 0) {
            cnt++;
        } else if(n % i != 0) {
        }
    }

    if(cnt != 0) {
        System.out.print("C");
    } else {
        System.out.print("N");
    }

    }
}