import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    double c = (double) a / b; 
    

    String temp = String.format("%.20f", c); //연산결과를 올림없이 온전하게 temp 메모리에 저장

    System.out.print(temp);
    

 

    
    }
}