import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int temp1 = a + b + c;
    int temp2 = (a + b + c)/3;
    System.out.println(temp1);
    System.out.println((int)temp2);
    System.out.print((int)(temp1 - temp2)); 
    //평균을 연산하게 되면 소수가 나오게 되므로
    //int 타입으로 항상 형변환시켜 출력하면 소수점은 버리게 된다.
    }
}