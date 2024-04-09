import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int cnt = 0;
    double avr = 0.0;

    for(int i = 1; i <= n; i++) {
        int a = sc.nextInt();
        sum += a;
        cnt++;
    }
    avr = (double) sum / (cnt);
    System.out.print(sum + " ");
    System.out.print(avr);
    }
}