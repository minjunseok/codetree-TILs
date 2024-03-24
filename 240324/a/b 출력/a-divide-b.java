import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    double c = (double) a / b; 
    

    String temp = String.format("%.20f", c);

    System.out.print(temp);
    

 

    
    }
}