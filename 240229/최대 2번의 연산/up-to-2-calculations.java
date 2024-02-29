import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int temp = 0;

    if(a % 2 == 0) {
        temp = a / 2;
        if(temp % 2 == 1) {
            temp = (temp + 1) / 2; 
        }
        System.out.print(temp);
    }
}
}