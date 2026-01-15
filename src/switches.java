public class switches {
    public static void main(String[] args) {
        String day = "Monday";
        if (day.equals("Monday")){
            System.out.println("Time to get to work!");
        } else if (day.equals("Tuesday")) {
            System.out.println("Moving along1");
        } else if (day.equals("Wednesday")) {
            System.out.println("Moving along2");
        } else if (day.equals("Thursday")) {
            System.out.println("Moving along3");
        } else if (day.equals("Friday")) {
            System.out.println("Moving along4");
        } else if (day.equals("Saturday")) {
            System.out.println("Moving along5");
        } else if (day.equals("Sunday")) {
            System.out.println("Moving along6");
        }

        switch (day){
            case "Monday":
                System.out.println("Time to get to work!");
                break;
            case "Tuesday":
                System.out.println("Moving along1");
                break;
            default:
                System.out.println("Meh");
        }

        switch (day){
            case "Monday" -> System.out.println("Its Monday");
            case "Tuesday" -> System.out.println("Its Tuesday");
            default -> System.out.println("Meh");

        }





    }
}
