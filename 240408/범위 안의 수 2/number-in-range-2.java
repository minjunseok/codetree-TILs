import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        double avr = 0.0;

    for (int i = 1; i <= 10; i++) {
        int a = sc.nextInt();
        if (a >= 0 && a <= 200) {
            sum += a;
            cnt++;
        }
    }
    avr = (double) sum / cnt;
    System.out.print(sum + " ");
    System.out.printf("%.1f",avr);
    }
}