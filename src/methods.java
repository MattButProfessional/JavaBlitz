import java.util.Random;

public class methods {
    //DRY principle - DONT REPEAT YOURSELF
    //Almost as important as the ALK principle
    public static void main(String[] args) {
        happyBirthday(50,"Gary");
        happyBirthday(27,"Sam");
        happyBirthday(25,"Kevin");
        happyBirthday(46,"Mary");

        System.out.printf("Logan is %s\n", getRandomAdj());
        System.out.printf("Chevy is %s\n", getRandomAdj());
        System.out.printf("Ben is %s\n", getRandomAdj());
        System.out.printf("Aiden is %s\n", getRandomAdj());
        System.out.printf("Brad is %s\n", getRandomAdj());
        System.out.printf("Matt is %s\n", getRandomAdj());
        System.out.printf("Alex is %s\n", getRandomAdj());
        System.out.printf("Tony is %s\n", getRandomAdj());

        System.out.printf("The password %s is %b\n","passwd", isValid("passwd"));
        System.out.printf("The password %s is %b\n","password", isValid("password"));

    }

    public static void happyBirthday(int age,  String name) {
        System.out.printf("Happy birthday %s, you are now %d years old!\n",name,age);
    }

    //method that returns a value
    public static String getRandomAdj(){
        Random random = new Random();
        int num = random.nextInt(10);
        switch (num){
            case 1,2 -> {return "goofing off";}
            case 3,4 -> {return "sleeping";}
            case 5,6 -> {return "doing their work";}
            case 7,8 -> {return "doin' a silly little dance";}
            case 9 -> {return "wondering why Mr. Klins is still teaching";}
            case 0 -> {return "winning the lottery!";}
            default -> {return "no one knows";}
        }
    }

    public static boolean isValid(String password) {
        if(password.contains(" ")){
            return false;
        }
        if(password.length() < 8){
            return false;
        }
        return true;
    }



}
