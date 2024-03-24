import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int a = sc.nextInt();

        int b = sc.nextInt();

        // 나눗셈 결과를 저장할 변수
        StringBuilder result = new StringBuilder();

        // 나눗셈 연산 수행
        int c = a / b;
        int d = a % b;
        result.append(c).append('.'); // 몫을 결과에 추가

        // 나머지를 이용하여 소수부 계산
        for (int i = 0; i < 20; i++) {
            d *= 10; // 나머지에 10을 곱하여 다음 자릿수 계산
            result.append(d / b); // 나머지를 나눈 값(다음 자릿수)을 결과에 추가
            d %= b; // 나머지 갱신
        }

        // 결과 출력
        System.out.println(result.toString());

        sc.close();
    }
}