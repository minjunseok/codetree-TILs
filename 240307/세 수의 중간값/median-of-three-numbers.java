import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.print((b > a && b < c) ? 1 : 0);

    //if else 문 사용시
    // if (b > a && b < c) {
    //     System.out.print(1);
    // } else {
    //     System.out.print(0)
    // }
    }
}