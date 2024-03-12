import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();


    //주석 안 코드는 내가 한참동안 붙잡고 놓아주질 않았던 코드로 계속 특정 반례를 통과시키지 못 했다
    //그래서 아예 false인 경우를 먼저 생각하고 아래쪽에 새로 작성했다.
//     if (a  % 4 == 0) {
//         System.out.print("true");
//         } else if ((a % 100 == 0) && (a % 400 == 0)) {
//         System.out.print("true");
//         } else if ((a % 100 == 0) && (a % 400 != 0)) {
//         System.out.print("false");
//     }
//     }
// }

if ((a % 100 == 0) && (a % 400 != 0)) {
    System.out.print("false");
} else if (a % 4 != 0) {
    System.out.print("false");
} else {
    System.out.print("true");
}
    }
}



// 코드트리 해설에 나온 코드

//         // 변수 선언
//         int y;
        
//         // 입력
//         y = sc.nextInt();
        
//         if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
//             System.out.println("true");
//         else
//             System.out.println("false");
//     }
// }