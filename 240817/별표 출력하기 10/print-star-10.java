import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 위쪽 부분 출력
        for (int i = 0; i < n; i++) {
            int stars;
            if (i % 2 == 0) {
                stars = (i / 2) + 1;
            } else {
                stars = n - (i / 2);
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 아래쪽 부분 출력
        for (int i = n - 1; i >= 0; i--) {
            int stars;
            if (i % 2 == 0) {
                stars = (i / 2) + 1;
            } else {
                stars = n - (i / 2);
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        }
    }