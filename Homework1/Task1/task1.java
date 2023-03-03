import java.util.Scanner;

public class task1 {
 public static void main(String[] args) {
  System.out.print("\033[H\033[J");
  Scanner c = new Scanner(System.in);
  System.out.println("Введите число:");
  int n = c.nextInt();
  int l = n;
  int s = n;
  int res = n * (n + 1) / 2;
  
  for (int i = 1; i < s; i++) 
  {
    l = l * i;
  }

  System.out.println("Для числа " + n + " треугольное число равно " + res);
  System.out.println("Для числа " + n + " факториал равен " + l);
 }
}