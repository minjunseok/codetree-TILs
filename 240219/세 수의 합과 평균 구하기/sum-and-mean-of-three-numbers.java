import java.util.Scanner;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.printf("%d\n", a + b + c);
    System.out.printf("%d", (int) (a + b + c) / 3); 
    //평균을 계산 했을시 소수점이 출력되므로 버리기위해 int로 형변환시키고 출력타입도 정수 %d로 바꾼다
  }
}