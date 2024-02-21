import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float temp1 = 0;
    float temp2 = 0;


    temp1 = (a / 100) * (a / 100);
    temp2 = (int) (b / temp1);
    if (temp2 > 25) {
      System.out.printf("%.0f\n", temp2);
      System.out.print("Obesity");
    } else
    System.out.printf("%.0f", temp2);
  }

}