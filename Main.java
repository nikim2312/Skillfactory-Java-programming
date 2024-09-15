import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner op1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int operand1 = op1.nextInt();



        Scanner operation_s = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        String tmp = operation_s.next();
        char operation = tmp.charAt(0);
        int operand2;
        while(true)
        {
            Scanner op2 = new Scanner(System.in);
            System.out.println("Введите второе число: ");
            operand2 = op2.nextInt();
            if(operand2 == 0 && operation == '/')
            {
                System.out.println("На ноль делить нельзя. Пожалуйста введите корректное число: ");
            }
            else
                break;
        }



        int res = Calculate.calculating(operand1, operand2, operation );
        System.out.println(res);


    }
}
