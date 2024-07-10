import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
        
        for (int i = n; i >= 1; i--) {
            // 왼쪽 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // 가운데 공백 출력
            for (int j = 0; j < (n - i) * 2; j++) {
                System.out.print(" ");
            }
            // 오른쪽 별 출력
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // 줄 바꿈
            System.out.println();
        }
        
        sc.close();
    }
}