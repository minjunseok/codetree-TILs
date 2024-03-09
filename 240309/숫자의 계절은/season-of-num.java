import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (3 <= a && 5 >= a) {
        System.out.print("Spring");
    } else if (a >= 6 && a <= 8) {
        System.out.print("Summer");
    } else if (a >= 9 && a <= 11) {
        System.out.print("Fall");
    } else if (a <= 2 || a == 12) {
        System.out.print("Winter");
    }
    }
    }