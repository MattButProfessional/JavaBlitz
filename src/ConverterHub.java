import java.util.Scanner;

public class ConverterHub {
    public static void main(String[] args) {

        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~\n1 = Temperature Converter\n2 = Weight Converter\n3 = Degrees → Radians\n~~~~~~~~~~~~~~~~~~~~~~~~~\nCHOOSE AN OPTION: ");
        Scanner myScanner = new Scanner(System.in);
        int menuOption = myScanner.nextInt();

        switch (menuOption){
            case 1:
                System.out.print("Please input a temperature: ");
                double temp = myScanner.nextDouble();
                System.out.println("Would you like to convert \"C2F\" or \"F2C\"? ");
                String convertChoiceTemp = myScanner.next();
                double tempFinal = 0;
                switch (convertChoiceTemp.toUpperCase()){
                    case "C2F":
                        tempFinal = (temp * 9/5) + 32;
                        System.out.printf("Your temp in fahrenheit: %.2f",tempFinal);
                        break;
                    case "F2C":
                        tempFinal = (temp - 32) * 5/9;
                        System.out.printf("Your temp in celsius: %.2f",tempFinal);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 2:
                System.out.print("Please input a weight: ");
                double weight = myScanner.nextDouble();
                System.out.println("Would you like to convert \"LB2KG\" or \"KG2LB\"? ");
                String convertChoiceWeight = myScanner.next();
                double weightFinal = 0;
                switch (convertChoiceWeight.toUpperCase()){
                    case "LB2KG":
                        weightFinal = weight / 2.20462 ;
                        System.out.printf("Your weight in kilograms: %.2f",weightFinal);
                        break;
                    case "KG2LB":
                        weightFinal = weight  *  0.45359237;
                        System.out.printf("Your weight in pounds: %.2f",weightFinal);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 3:
                System.out.print("Please input a degree: ");
                double degrees = myScanner.nextDouble();
                double radians = degrees * (Math.PI / 180);
                System.out.printf("Your degree in radians: %.4f",radians);
                break;
            default:
                System.out.println("Invalid choice");
        }

        String response = menuOption == 1 || menuOption == 2 || menuOption == 3 ? "\n\nNice! You used a converter." : "Try again.";
        System.out.println(response);
    }
}
