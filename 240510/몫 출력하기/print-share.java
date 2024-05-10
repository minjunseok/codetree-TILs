import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int div = 0;
    int cnt = 0;

    

    while(cnt < 3) {

        try {

        int a = sc.nextInt();
        
            if ((a % 2) == 0) {
                System.out.println(a / 2);
                cnt++;
            }
                } catch (Exception e) {
                        // 입력이 더 이상 없는 경우 예외 발생
                        break;
                    }
    
                }
        sc.close();
       
    }
        
        
}