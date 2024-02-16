import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();

    System.out.printf("%.0f",a + b);
    System.out.print(" ");
    System.out.printf("%.1f", (a + b)/2);

    }
}