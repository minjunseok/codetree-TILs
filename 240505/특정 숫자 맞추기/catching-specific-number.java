import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        while(true) {
            int a = sc.nextInt();
            if (a < 25) {
                System.out.println("Higher");
            } else if (a > 25) {
                System.out.println("Lower");
            } else if (a == 25) {
                System.out.print("Good");
                break;
            }              
            }
        }
    }