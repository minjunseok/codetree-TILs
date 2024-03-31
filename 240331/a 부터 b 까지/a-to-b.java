import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();


    for(int i = a; i <= b;) {
    if (i % 2 == 0 && i <= b) {
        System.out.print(i + " ");
        i += 3;
    }
    if (i % 2 != 0 && i <= b) {
        System.out.print(i + " ");
        i = i * 2;
    }
    }

    }
}