import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int cnta = 0;
    int cntb = 0;
    int cntc = 0;

    for(int i = 1; i <= a; i++) {
        if (i % 2 == 0 && i % 3 != 0 && i % 12 != 0) {
            cnta++;
        } 
        if (i % 3 == 0 && i % 12 != 0) {
            cntb++;
        }
        if (i % 12 == 0) {
            cntc++;
        }
    }
    System.out.print(cnta + " ");
    System.out.print(cntb + " ");
    System.out.print(cntc);
    }
}