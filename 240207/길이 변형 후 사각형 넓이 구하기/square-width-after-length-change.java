import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + 8 + "\n");
        System.out.print(b * 3 + "\n");
        System.out.printf("%d",(a + 8) * (b * 3));
    }
}