import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if ((a % 2 == 1 && a % 3 == 0) || (a % 2 == 0 && a % 5 == 0)) {
        System.out.print("true");
    } else { 
        System.out.print("false");
    }
    }
}