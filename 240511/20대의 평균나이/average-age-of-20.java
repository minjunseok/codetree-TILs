import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        double avr = 0;

    while(true) {

        int a = sc.nextInt();

        if(a < 30) {

            sum += a;
            cnt++;

        } else {

            avr = (double) sum / cnt;
            System.out.printf("%.2f" , avr);
            break;

        }

            
        
        }
        sc.close();

    
        
    }
    

    }