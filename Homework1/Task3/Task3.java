import java.util.Scanner;

public class Task3 
{
        public static void main(String[] args) 
        {
         
         System.out.print("\033[H\033[J");
         Scanner sc = new Scanner(System.in);
         System.out.println("Введите первое число:");
         double n1 = sc.nextDouble();
         System.out.println("Выберите действие:\n1. Сложение(+)\n2. Вычитание(-)\n3. Умножение(*)\n4.Деление(/)\n");
         int action = sc.nextInt();
         System.out.println("Введите второе число:");
         double n2 = sc.nextDouble();

         switch (action) {
            case 1:
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case 2:
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case 3:
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case 4:
                System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                break;
        }
    }
}
