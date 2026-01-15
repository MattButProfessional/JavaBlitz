import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()){
            System.out.print("Please enter your name -> ");
            name = myScanner.nextLine().trim();
        }

        System.out.printf("Hello %s\n", name);

        //

        String sonic = "bum";
        while (sonic.equals(sonic)){
            System.out.printf("%s is a %s\n",name ,sonic);
            break;
        }

        //

        int age;
        do{
            System.out.print("Please enter your age: ");
            age = myScanner.nextInt();
            myScanner.nextLine();
            if (age < 0) {
                System.out.println("Age must be >= 0");
            }
        }while(age < 0);

    }
}
