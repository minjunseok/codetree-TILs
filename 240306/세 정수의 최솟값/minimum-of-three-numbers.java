import java.util.*;



public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    

    //-100 -99 -98 
    if (a >= b && b >= c) {
        System.out.print((int)c);
    } else if (b >= c && c >= a) {
        System.out.print((int)a);
    } else if (c >= a && a >= b) {
        System.out.print((int)b);
    }
    }
}