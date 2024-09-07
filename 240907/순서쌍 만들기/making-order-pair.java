import java.util.*;


public class Main {
    public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
        
        // 내림차순으로 (n,n)부터 (1,1)까지 출력
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
        
        sc.close();
    }

}