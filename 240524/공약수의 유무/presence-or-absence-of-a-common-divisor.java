import java.util.*;

public class Main {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int cnt = 0;

    for(int i = a; i <= b; i++) {
        if (1920 % i == 0 && 2880 % i == 0) {
            cnt++;
        } else {

        }
    } 
    
    if(cnt != 0) {

        System.out.print(1);

    } else {

        System.out.print(0);

    }

    }
}