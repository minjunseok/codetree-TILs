import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    char d = sc.next().charAt(0);
    int a = sc.nextInt();

    char e = sc.next().charAt(0);
    int b = sc.nextInt();

    char f = sc.next().charAt(0);
    int c = sc.nextInt();

    
    char t1 = 0;
    char t2 = 0;
    char t3 = 0;
    
    if (a >= 37) {
        if (d == 'Y') {
            t1 = 'A';
        } else if (d == 'N') {
            t1 = 'B';
        }
    } if (a <= 36) {
        if (e == 'Y') {
            t1 = 'C';
        } else {
            t1 = 'D';
        }
    }
    if (b >= 37) {
        if (e == 'Y') {
            t2 = 'A';
        } else if (d == 'N') {
            t2 = 'B';
        }
    } if (b <= 36) {
        if (e == 'Y') {
            t2 = 'C';
        } else {
            t2 = 'D';
        }
    }
    if (c >= 37) {
        if (f == 'Y') {
            t3 = 'A';
        } else if (f == 'N') {
            t3 = 'B';
        }
    } if (c <= 36) {
        if (f == 'Y') {
            t3 = 'C';
        } else {
            t3 = 'D';
        }
    }
    if (t1 == 'A' && t2 == 'A' || t2 == 'A' && t3 == 'A' || t3 == 'A' && t1 == 'A') {
        System.out.print("E");
    } else {
        System.out.print("N");
    }
    }
}


//       해설에서는 좀더 간결하게 다뤘다.

//       Scanner sc = new Scanner(System.in);

//         // 변수 선언
//         char c1, c2, c3;
//         int t1, t2, t3;
        
//         // 입력
//         c1 = sc.next().charAt(0);
//         t1 = sc.nextInt();
//         c2 = sc.next().charAt(0);
//         t2 = sc.nextInt();
//         c3 = sc.next().charAt(0);
//         t3 = sc.nextInt();

//         // 출력
//         // A가 2명 이상인지 판단하기
//         if(c1 == 'Y' && t1 >= 37) {
//             // 첫 번째 사람이 A라면, 남은 두 사람 중 한 사람이라도 A면 됩니다.
//             if((c2 == 'Y' && t2 >= 37) || (c3 == 'Y' && t3 >= 37))
//                 System.out.println("E");
//             else
//                 System.out.println("N");
//         }
//         else {
//             // 첫 번째 사람이 A가 아니라면, 남은 두 사람 모두 A여야만 합니다.
//             if((c2 == 'Y' && t2 >= 37) && (c3 == 'Y' && t3 >= 37))
//                 System.out.println("E");
//             else
//                 System.out.println("N");
//         }
//     }
// }