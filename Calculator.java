import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;

        System.out.println("What is the action you want to do?\n1-Addition\n2-Substraction\n3-Division\n4-Multiplication\n5-Percent\n6-Factorial\n7-QUİT");

        while (true) {
            int loop = scanner.nextInt();

            switch (loop) {

                case 1:
                    System.out.println("First Number = ");
                    number1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    number2 = scanner.nextDouble();
                    System.out.println("Result = " + (number1 + number2));
                    break;

                case 2:
                    System.out.println("First Number = ");
                    number1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    number2 = scanner.nextDouble();
                    System.out.println("Result = " + (number1 - number2));
                    break;

                case 3:
                    System.out.println("First Number = ");
                    number1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    number2 = scanner.nextDouble();
                    System.out.println("Result = " + (number1 / number2));
                    break;

                case 4:
                    System.out.println("First Number = ");
                    number1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    number2 = scanner.nextDouble();
                    System.out.println("Result = " + (number1 * number2));
                    break;

                case 5:
                    System.out.println("First Number = ");
                    number1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    number2 = scanner.nextDouble();

                    double percent = (number1 * number2) / 100;

                    System.out.println("Result = " + percent);
                    break;

                case 6:
                    System.out.println("First Number");

                    int num = scanner.nextInt();
                    long Factorial = 1;
                    for(int i = 1; i <=num; ++i){
                        Factorial *= i;
                    }

                    System.out.printf("%d The Factorial of the Number = %d \n", num, Factorial);
                    break;

                case 7:
                    System.out.println("OUTPUT IS ");
                    break;

                default:
                    System.out.println("Invalid number");
            }
            if(loop == 7){break;}
        }
    }
}
