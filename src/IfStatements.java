import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        int age = 19;
        if(age >= 21){
            System.out.println("You're allowed to drink, but you shouldn't... drinking is bad");
        }else if(age >= 18){
            System.out.println("You can vote... voting is good!");
        }else {
        System.out.println("You cant do anything");
        }

        System.out.print("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase( "Klins")){
            System.out.println("You need a new job and a therapist, BOZO!");

        }else{
            System.out.println("Keep on keepin on!");
        }
    }
}
