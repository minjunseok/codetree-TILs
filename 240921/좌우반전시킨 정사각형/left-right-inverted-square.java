import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int cnt = 1;

    for(int i = 1; i <= n; i++) {

        for(int j = n; j > 0; j--) {
             
            System.out.print((j * i) + " ");


        }

        cnt++;
        System.out.println();

    }
    }
}