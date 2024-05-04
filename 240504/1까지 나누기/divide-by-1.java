import java.util.*;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int dev = 0;
    int cnt = 0;
    dev = a;

    for(int i = 1; i <= a; i++) {

        
        dev /= i;
        cnt++;

        if(dev <= 1) {
           break;
        }

    }
    System.out.print(cnt);
    }
}