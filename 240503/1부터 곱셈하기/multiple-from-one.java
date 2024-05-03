import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int mul = 1;

        for(int i = 1; i <= 10; i++) {
            mul *= i;
            if(mul >= a) {
                System.out.print(i);
                break;
            } else {
                continue;
            }
        }
    }
}