import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        //위 두줄 내용과 같다 = char c = sc.next().charAt(0);
        System.out.println(c);
    }

}