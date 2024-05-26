import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int cnt = 0;

    for(int i = 1; i <= 5; i++) {

        int a = sc.nextInt();

        if (a % 3 != 0) {

            cnt++;

        }

        }

        if (cnt != 0) {

            System.out.print(0);

        } else {

            System.out.print(1);

        }
    }


}