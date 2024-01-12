public class Main {
    public static void main(String[] args) {
        int a = 5 , b = 6 , c = 7;
        int temp1 , temp2 , temp3;

        temp1 = a;
        temp2 = b;
        temp3 = c;

        
        b = temp1; //b = 5;
        c = temp2; //c = 6;
        a = temp3; //a = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}