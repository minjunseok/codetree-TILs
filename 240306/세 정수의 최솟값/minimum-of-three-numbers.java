import java.util.*;



public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();
    

    //-100 -99 -98 
    if (a >= b && b >= c) {
        System.out.printf("%.0f",c);
    } else if (b >= c && c >= a) {
        System.out.printf("%.0f",a);
    } else if (c >= a && a >= b) {
        System.out.printf("%.0f",b);
    }
    }
}