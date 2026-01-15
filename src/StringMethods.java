import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
//        String awesome = "Mr. Klinsr";
//        System.out.printf("Length: %d \n", awesome.length());
//
//        System.out.println(awesome.charAt(4));
//        System.out.println(awesome.indexOf("Klins"));
//        System.out.println(awesome.lastIndexOf("r"));
//        System.out.println(awesome.toUpperCase());
//        System.out.println(awesome.toLowerCase());
//        System.out.println("    spaces all around!     ".trim());
//        System.out.println(awesome.replace("Mr", "Mrs"));
//
//        String subString = awesome.substring(0,3);
//        System.out.println(subString);
//
//        //get everything from a start point
//        System.out.println(awesome.substring(6));
//        //Get just Klinsr from the string, without hardcoding the start.
//        System.out.println(awesome.substring(awesome.indexOf(" ") + 1));
//
//


        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your email -> ");
        String email = myScanner.nextLine();
        System.out.println(email);

        if (email.indexOf("@") > 1 ){
//            if  (email.lastIndexOf(".")+2) ==
                    System.out.println("Yes that is a valid email");
        }else {
            System.out.println("No that is not a valid email");
        }


    }

}

/*
Data Type Specifier Example
String %s "Hello %s"
char %c "First letter: %c"
int %d "You are %d years old"
double %f "You are %f inches tall"
boolean %b "Employed: %b"
*/