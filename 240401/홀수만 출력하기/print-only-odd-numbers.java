import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Object> ar = new ArrayList<>();

    int a = sc.nextInt();
    int count = 0;
    
 
    for(int i = 1; i <= a; i++) {
        int b = sc.nextInt();

        if((b % 2 != 0) && (b % 3 == 0)) {
        ar.add(b);
        count += 1; 
        }
    } 

    for (int i = 0; i < count; i++) {
    System.out.println(ar.get(i));
    }
    }
}