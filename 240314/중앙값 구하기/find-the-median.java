import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
//26 , 22 ,30 
    if (a > b) {
       if (b > c) {
        System.out.print(b);
       } else if (c > a) {
        System.out.print(a);
       } else {
        System.out.print(c);
       }
    } else if (c > a) {
        if (a > b) {
        System.out.print(a);
        } else if (b > c) {
        System.out.print(c);
        } else {
        System.out.print(b);
        }
    } else if (b > c) {
        if (c > a) {
        System.out.print(c);
        } else if (a > b) {
        System.out.print(b);
        } else {
        System.out.print(a);
        }
    } else if (a > c) {
        if (c > b) {
        System.out.print(c);
        } else if (b > a) {
        System.out.print(a);
        } else {
        System.out.print(b);
        }
    }

    }
}