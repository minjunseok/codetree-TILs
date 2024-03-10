import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a1 = sc.nextInt();
    String a2 = sc.next();
    int b1 = sc.nextInt();
    String b2 = sc.next();

    //equals 메서드를 통해 성별 비교하기
    
    if((a1 >= 19 && a2.equals("M")) || (b1 >= 19 && b2.equals("M"))) {
        System.out.print(1);
    } else {
        System.out.print(0);
    }
    }
}



// //문자열끼리 == 로 처리하고싶다면 성별 입력 변수를 char타입으로 하고  charAt(0)메서드를 통해 첫글자에 대해서만 다루게 하면 된다.
// int a1 = sc.nextInt();
// char a2 = sc.next().charAt(0);

// int b1 = sc.nextInt();
// char b2 = sc.next().charAt(0);

// if ((a1 >= 19 && a2 == 'M') || (b1 >= 19 && b2 == 'M')) {
//     System.out.print(1);
// } else {
//     System.out.print(0);
// }
// }
// }