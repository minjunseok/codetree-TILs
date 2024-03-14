import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char d = sc.next().charAt(0);
    int a = sc.nextInt();
    char e = sc.next().charAt(0);
    int b = sc.nextInt();
    char f = sc.next().charAt(0);
    int c = sc.nextInt();

    
    char t1 = 0;
    char t2 = 0;
    char t3 = 0;
    
    if (a >= 37) {
        if (d == 'Y') {
            t1 = 'A';
        } else if (d == 'N') {
            t1 = 'B';
        }
    } if (a <= 36) {
        if (e == 'Y') {
            t1 = 'C';
        } else {
            t1 = 'D';
        }
    }
    if (b >= 37) {
        if (e == 'Y') {
            t2 = 'A';
        } else if (d == 'N') {
            t2 = 'B';
        }
    } if (b <= 36) {
        if (e == 'Y') {
            t2 = 'C';
        } else {
            t2 = 'D';
        }
    }
    if (c >= 37) {
        if (f == 'Y') {
            t3 = 'A';
        } else if (f == 'N') {
            t3 = 'B';
        }
    } if (c <= 36) {
        if (f == 'Y') {
            t3 = 'C';
        } else {
            t3 = 'D';
        }
    }
    if (t1 == 'A' && t2 == 'A' || t2 == 'A' && t3 == 'A' || t3 == 'A' && t1 == 'A') {
        System.out.print("E");
    } else {
        System.out.print("N");
    }
    }
}