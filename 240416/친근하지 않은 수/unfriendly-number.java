import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= a; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                continue;
            } else {
                sum++;
            }
            
        }
        System.out.print(sum);
    }
    
}