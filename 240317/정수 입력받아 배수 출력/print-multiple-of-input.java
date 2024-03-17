import java.util.*;


public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    //a * 1 , a * 2 , a * 3, a * 4, a * 5
    for (int i = a; i <= 5 * a; i += a) {
        System.out.print(i + " ");
    }
    }
}