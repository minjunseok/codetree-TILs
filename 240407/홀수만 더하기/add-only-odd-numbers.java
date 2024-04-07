import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int c = sc.nextInt();
    int sum = 0;

    for(int i = 0; i < c; i++) {
        int d = sc.nextInt();
        if (d % 2 != 0 && d % 3 == 0) {
            sum += d;
        }

    }
    System.out.print(sum);
    }
}