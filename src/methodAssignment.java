import java.util.Random;
import java.util.Scanner;

public class methodAssignment {
    public static int playerMoney = 50;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int wager = 1;
        Random random = new Random();
        do {
            System.out.printf("Your balance is $%s\n",playerMoney);
            System.out.print("How much money would you like to wager? ");
            wager = myScanner.nextInt();
            notMain(wager,random);
        }while (playerMoney > 0);
        System.out.println("YOURE ALL OUT OF MONEY! GAME OVER");
    }


    public static void notMain(int wager, Random random ) {
        if (wager > 0 && wager <= playerMoney){
            int randRoll = random.nextInt(6);
            if (randRoll % 2 == 0 ){
                System.out.println("You Lost!");
                playerMoney -= wager;
            } else {
                System.out.println("You Won!");
                playerMoney += wager;
            }
        }else{
            System.out.println("Invalid amount");
        }
    }
}
