import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Choose: \n1. Add \n2. Subtract \n3. Multiply \n4. Divide");
        int choice = myScanner.nextInt();

        System.out.println("What is your first number? ");
        int num1 = myScanner.nextInt();

        System.out.println("What is your second number? ");
        int num2 = myScanner.nextInt();

        int num3;

        switch (choice){
            case 1:
                num3 = num1 + num2;
                System.out.printf("%d + %d = %d\n", num1, num2, num3);
                break;
            case 2:
                num3 = num1 - num2;
                System.out.printf("%d - %d = %d\n", num1, num2, num3);
                break;
            case 3:
                num3 = num1 * num2;
                System.out.printf("%d * %d = %d\n", num1, num2, num3);
                break;
            case 4:
                num3 = num1 / num2;
                System.out.printf("%d / %d = %d\n", num1, num2, num3);
                break;
        }

    }
}

