import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a == 2) {
        System.out.print(28);
    } else if ((a <= 7 && a % 2 != 0) || (a >= 8 && a % 2 == 0)) {
        System.out.print(31);
    } else {
        System.out.print(30);
    }
    }
}
       
        //1,3,5,7,8,10,12 = 31
    
        //2 = 28
  
        //4,6,9,11 = 30 


      //해설
            //  Scanner sc = new Scanner(System.in);

//         // 변수 선언
//         int n;
        
//         // 입력
//         n = sc.nextInt();

//         // 출력
//         if(n == 2)
//             System.out.println("28");
//         else if(n <= 7) {
//             if(n % 2 == 1)
//                 System.out.println("31");
//             else
//                 System.out.println("30");
//         }
//         else {
//             if(n % 2 == 0)
//                 System.out.println("31");
//             else
//                 System.out.println("30");
//         }
//     }
// }