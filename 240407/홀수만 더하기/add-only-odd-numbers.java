import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int c = sc.nextInt();
    int sum = 0;

    for(int i = 1; i <= c; i++) {
        if (i % 2 != 0 && i % 3 == 0) {
            sum++;
        }

    }
    System.out.print(sum);
    }
}