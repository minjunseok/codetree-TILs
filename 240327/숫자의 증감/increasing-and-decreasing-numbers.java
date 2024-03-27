import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    char c = s.charAt(0);
    int a = sc.nextInt();

    if (c == 'A') {
        for(int i = 1; i <= a; i++) {
            System.out.print(i + " ");
          
        } 
    } else if (c == 'D') {
        for (int i = a; i >= 1; i--) {
            System.out.print(i + " ");
            
        }
    }
    
    }
}