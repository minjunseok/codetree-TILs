import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    float t1 = a + b;
    float t2 = a - b;
    System.out.printf("%.2f",t1 / t2 );
    }
}