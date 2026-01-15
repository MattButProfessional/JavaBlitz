import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        //ternary  operators - like a short if
        int num = 5;
        Scanner s = new Scanner(System.in);
        System.out.println("Type 5");
        int guess = s.nextInt();
        //the ternary
        //format variable = condition ? value if true : value if false
        String response = guess == num ? "Correct" : "Wrong you idiot!";
        System.out.println(response);
    }
}
