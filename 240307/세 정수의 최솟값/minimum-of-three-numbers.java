import java.util.*;



public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    

    //-100 -99 -98 
    if (a >= b && b > c) {
        System.out.print(c);
    } else if (b >= c && c > a) {
        System.out.print(a);
    } else if (c >= a && a > b) {
        System.out.print(b);
    }
    }
}