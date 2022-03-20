import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sayi1, sayi2;

        System.out.println("What is the action you want to do?\n1-Addition\n2-Substraction\n3-Division\n4-Multiplication\n5-Percent\n6-Quit\n");

        while (true) {
            int islem = scanner.nextInt();

            switch (islem) {

                case 1:
                    System.out.println("First Number = ");
                    sayi1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    sayi2 = scanner.nextDouble();
                    System.out.println("Result = " + (sayi1 + sayi2));
                    break;

                case 2:
                    System.out.println("First Number = ");
                    sayi1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    sayi2 = scanner.nextDouble();
                    System.out.println("Result = " + (sayi1 - sayi2));
                    break;

                case 3:
                    System.out.println("First Number = ");
                    sayi1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    sayi2 = scanner.nextDouble();
                    System.out.println("Result = " + (sayi1 / sayi2));
                    break;

                case 4:
                    System.out.println("First Number = ");
                    sayi1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    sayi2 = scanner.nextDouble();
                    System.out.println("Result = " + (sayi1 * sayi2));
                    break;

                case 5:
                    System.out.println("First Number = ");
                    sayi1 = scanner.nextDouble();
                    System.out.println("Second Number = ");
                    sayi2 = scanner.nextDouble();

                    double yüzde = (sayi1 * sayi2) / 100;

                    System.out.println("Result = " + yüzde);
                    break;

                case 6:
                    System.out.println("OUTPUT IS ");
                    break;

                default:
                    System.out.println("Invalid number");
            }
            if(islem == 6){break;}
        }
    }
}



