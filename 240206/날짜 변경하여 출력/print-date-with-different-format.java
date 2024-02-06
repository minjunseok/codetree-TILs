import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    sc.useDelimiter("\\."); // sc.useDelimiter();사용시 정규식이므로 괄호안에
                            // 사용할 문자 앞에 반드시 \\를 붙여줘야한다.

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.printf("%d-%d-%d",b,c,a); //a,b,c순으로 입력 받고 (년,월,일)
                                        //출력시엔  b,c,a(월,일,년)  순으로 출력한다.

    }
}