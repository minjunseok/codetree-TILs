import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    sc.close();
//String 타입을 사용하면 if문 조건으로 equals 메서드를 통해 비교하여 일치하는지 확인한다
    if (a.equals("S")) {
      System.out.print("Superior");
    } else if (a.equals("A")) {
      System.out.print("Excellent");
    } else if (a.equals("B")) {
      System.out.print("Good");
    } else if (a.equals("C")) {
      System.out.print("Usually");
    } else if (a.equals("D")) {
      System.out.print("Effort");
    } else {
      System.out.print("Failure");
    }
  }
}

// 해설에 적힌 방법 

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // 변수 선언
//         char a; 내가 했던 방법과 다르게 1글자만 입력할 수 있는 변수타입 char을 사용한다.
        
//         // 입력
//         a = sc.next().charAt(0); 입력한 문자에서 0번째 글자만을 가져와 a에 넣는다.
                                    
        
//         // 출력
//         if(a == 'S')
//             System.out.println("Superior");
//         else if(a == 'A')
//             System.out.println("Excellent");
//         else if(a == 'B')
//             System.out.println("Good");
//         else if(a == 'C')
//             System.out.println("Usually");
//         else if(a == 'D')
//             System.out.println("Effort");
//         else
//             System.out.println("Failure");
//     }
// }