import java.util.*;

public class Main {
    public static void main(String[] args) {    
        
        Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스에서는 별을 출력
                for (int j = 0; j < n - (i / 2); j++) {
                    System.out.print("* ");
                }
            } else {
                // 홀수 인덱스에서는 별을 출력
                for (int j = 0; j < (i + 1) / 2; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println(); // 줄 바꿈
        }

        // 하단 패턴 출력
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                // 짝수 인덱스에서는 별을 출력
                for (int j = 0; j < n - (i / 2); j++) {
                    System.out.print("* ");
                }
            } else {
                // 홀수 인덱스에서는 별을 출력
                for (int j = 0; j < (i + 1) / 2; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println(); // 줄 바꿈
        }

}
}