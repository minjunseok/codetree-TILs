import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = 0;

   

        while(true) {

            try {
                
                int a = sc.nextInt();
                int b = sc.nextInt();
                char c = sc.next().charAt(0);
            
                if(c != 'C') {

                mul = a * b;
                System.out.println(mul);
                    
                } else {
                    
                mul = a * b;
                System.out.println(mul);
                break;

                }

            } catch (Exception e) {

            break;
                
            }
    }
    sc.close();
}

}