import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    for(int i = 1; i <= a; i++){
        
        int c = i / 10;
        int d = i % 10; 

        if (c == 3 || c == 6 || c == 9) {
            System.out.print(0 + " ");
        }
        if (d == 3 || d == 6 || d == 9)  {
            System.out.print(0 + " ");
        } else { 
            System.out.print(i + " ");
        }
        }
    }
    }