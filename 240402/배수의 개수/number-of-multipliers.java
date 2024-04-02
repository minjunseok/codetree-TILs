import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cnta = 0;
    int cntb = 0;
    
    for (int i = 0; i < 10; i++) {
        int a = sc.nextInt();
        if (a % 3 == 0) {
            cnta++;
        }
        if (a % 5 == 0) {
            cntb++;
        }
       
    }
    System.out.print(cnta + " " + cntb);
    
    }
    }