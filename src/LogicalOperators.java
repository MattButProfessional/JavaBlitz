//Terminology - LOGICAL OPERATORS - and (&&), or (||), not (!)
public class LogicalOperators {
    public static void main(String[] args) {
        int temp = 40;
        boolean sunny = false;
        if(temp >= 0 && temp <= 30){
            System.out.println("If this is celcius, its good");
        }else{
            System.out.println("HMMMMMMMMMMMMMMMMMMMMMMMMM");
        }

        // multiple ands

        if(temp >= 0 && temp <= 30 && sunny){
            System.out.println("Its good!");
        }else{
            System.out.println("meh");
        }

        // not not not not not - !!!!!!!!

        if (!sunny){
            System.out.println("its not sunny");
        }else{
            System.out.println("its sun");
        }

        // or - ||

        if(temp < 0 || temp > 30 ){
            System.out.println("the weather is not great");
        }

        // password junk idk:

        String password = "Mr. Klins Computer Programming";
        if (password.length() <= 4 || password.length() >= 12){
            System.out.println("Invalid Password");
        }else{
            System.out.println("It works");
        }

    }

}