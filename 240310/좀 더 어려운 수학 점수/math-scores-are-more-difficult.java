import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m1 = sc.nextInt();
    int e1 = sc.nextInt();
    int m2 = sc.nextInt();
    int e2 = sc.nextInt();

    if (m1 > m2) {
        System.out.print("A");
    } else if (m2 > m1) {
        System.out.print("B");
    } else if (m1 == m2) {
        if (e1 > e2) {
            System.out.print("A");
        } else if (e2 > e1) {
            System.out.print("B");
        }
    }

    }
}