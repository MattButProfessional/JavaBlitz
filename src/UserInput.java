//To get user input, you need to import a scanner
import java.util.Scanner; //This is needed for input

public class UserInput {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner myScanner = new Scanner(System.in); //Scan the console
        System.out.print("Please enter your name -> ");
        //Read in a string:
        String name = myScanner.nextLine();
        //next vs nextline:
        //next - reads just to the next space
        //nextline = reads to the end of a line

        System.out.printf("Hello %s\n ", name);
        System.out.print("Please enter your middle and last name -> ");
        String nextName = myScanner.next();
        System.out.printf("nextName = %s\n", nextName);
        myScanner.nextLine();
        System.out.println("Please enter your age: ");
        int age = myScanner.nextInt();

        //Common Error:
        // When you use scanner.next(), scanner.nextInt(), or .nextDouble()
        // it will read in the token (number or whatever), and leave the cursor
        // after it. This often means there is a \n that still needs consumed on the line
        //eg. if the line was 6\n
        //scanner.nextInt() will read in the 6 and the pointer will be pointing at "\n"
        //So the next time you call nextLine(), it reads in only the \n

        //common fix: add a nextLine() after any nextInt() calls
        System.out.println("Who is your favorite artist? ");
        String artist = myScanner.nextLine(); //reads in nothing because of the nextInt() above
        System.out.printf("Your favorite artist: %s",artist);



        myScanner.close();//Close scanners when you are done with them
    }
}
