import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int cnt = 0;
    int num = 1;

    while(true) {
        
        num *= 2;
        cnt++;

        if (num == a) {
            System.out.print(cnt);
            break;
        }
    }
    sc.close();
    }
}