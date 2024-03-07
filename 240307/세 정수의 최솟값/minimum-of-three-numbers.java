import java.util.*;


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();


    
    if (a >= b && b >= c) {
      System.out.print(c);
    } else if (a >= c && c >= b) {
      System.out.print(b);
    } else if (b >= c && c >= a) {
      System.out.print(a);
    } else if (b >= a && a >= c) {
      System.out.print(c);
    } else if (c >= a && a >= b) {
      System.out.print(b);
    } else if (c >= b && b >= a) {
      System.out.print(a);
    }
  }
}

//삼항 연산자를 사용하여 출력하면 위와 같은 코드를 사용 안 해도 더 간결하게 작성할 수 있다
//삼항 연산자의 ":" 콜론은 if와 else if 역할을 둘다 할 수 있다.
//
//   public class Main {
//     public static void main(String[] args) {
//         // 여기에 코드를 작성해주세요.
//         Scanner kb = new Scanner(System.in);
//         int a = kb.nextInt();
//         int b = kb.nextInt();
//         int c = kb.nextInt();

//         // 최소값 출력
//         System.out.print((a <= b && a <= c) ? a : b <= c ? b : c);
//     }
// }
// }