import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true) {
    int a = sc.nextInt();
    if (a == 1) {
        System.out.println("John");
    }
    if (a == 2) {
        System.out.println("Tom");
    }
    if (a == 3) {
        System.out.println("Paul");
    }
    if (a == 4) {
        System.out.println("Sam");
    } else {
        System.out.print("Vacancy");
        break;
    } 
    }
}
}