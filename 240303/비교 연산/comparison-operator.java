import java.util.*

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); //스캐너 객체 생성
    int a = sc.nextInt(); //스캐너를 통한 입력 변수 a와 b 선언
    int b = sc.nextInt();


        //기존의 if 문이 아닌 삼항연산자를 조건들을 이용해 출력시킨다.
    System.out.println(a >= b ? 1 : 0);
    System.out.println(a > b ? 1 : 0);
    System.out.println(b >= a ? 1 : 0);
    System.out.println(b > a ? 1 : 0);
    System.out.println(a == b ? 1 : 0);
    System.out.println(a != b ? 1 : 0);
    }
}