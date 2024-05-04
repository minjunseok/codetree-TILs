import java.util.*;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int dev = 0;
    int cnt = 0;

    for(int i = 1; i <= a; i++) {

      dev = a / i;
      cnt++;

        if(dev > 1) {
            continue;
        
        } else {
            System.out.print(cnt);
            break;
          
        }

    }
    }
}