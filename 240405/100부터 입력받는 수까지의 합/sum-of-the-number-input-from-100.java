import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    int c = sc.nextInt();
    int sum = 0;

    for (int i = c; i <= 100; i++) {
        sum += i;
    }
    System.out.print(sum);
    }
}