import java.util.Arrays;
import java.util.Scanner;

public class StoreAssignment {
    public static Scanner myScanner = new Scanner(System.in);

    public static String[] itemNames = {"Chips", "Granola Bar", "Cookies","Water", "Soda", "Juice", "Pencil", "Notebook", "Eraser"};
    public static double[] itemPrices = {4.99, .99 , 3.99, 1, 2.99, 3.99, 2.99, 1.99, .99};
    public static int[] itemStock = {60, 50 , 5, 100, 20, 10, 1000, 20, 100};

    public static String[] cartNames;
    public static int[] cartQty;

    public static String[][] categoryItems = {
            {"Snacks", "Chips", "Granola Bar", "Cookies"},
            {"Drinks", "Water", "Soda", "Juice"},
            {"Supplies", "Pencil", "Notebook", "Eraser"} };



    public static void main(String[] args) {
        int menuOption = menu();

    }

    public static int menu(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("          " + ((char)27 +"[4m") + "Main Menu" + ((char)27 +"[0m"));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("           " + ((char)27 +"[4m") + "Options" + ((char)27 +"[0m"));
        System.out.println("1. View categories and items");
        System.out.println("2. Search for an item by name");
        System.out.println("3. View cart");
        System.out.println("4. Checkout");
        System.out.println("5. Quit");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.print("Please choose an option: ");
        int menuOption = myScanner.nextInt();
        switch (menuOption){
            case 1: {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                categoryView();
                break;}
            case 2: {
                System.out.println("Searching");
                break;}
            case 3: {
                System.out.println("Viewing cart");
                break;}
            case 4: {
                System.out.println("Checking out ");
                break;}
            case 5: {
                System.out.println("BYE!");
                System.exit(0);
                break;}
            default: {
                System.out.println("Try again");}
        }
        return menuOption;
    }

    public static void categoryView() {
        System.out.println("           " + ((char)27 +"[4m") + "Items" + ((char)27 +"[0m"));
        for (String[] categories:categoryItems){
            for (int i=0; i<categories.length; i++){
                if(i == 0){
                    System.out.print(categories[i] + ": ");
                }else if(i == categories.length-1){
                    System.out.println(categories[i]);
                }else {
                    System.out.print(categories[i] + ", ");
                }
            }
        }
        System.out.println("\nWould you like to purchase an item?");
        String purchaseQuestion = myScanner.next().toLowerCase().trim();
        if (purchaseQuestion.equals("yes") || purchaseQuestion.equals("y")){
            addItemToCart();
        } else if (purchaseQuestion.equals("no") || purchaseQuestion.equals("n")){
            System.out.println("back to menu");
        }else{
            System.out.println("\nERROR: Please use \"yes\" or \"no\" ");
        }
    }

    public static void addItemToCart() {
        System.out.print("What item would you like to add to your cart? -> ");
        String itemAdding = myScanner.next().toLowerCase().trim();
        System.out.println(itemAdding);
        System.out.println(Arrays.toString(cartNames));
        System.out.println(Arrays.toString(itemNames));

        if (!Arrays.asList(cartNames).contains(itemAdding) && Arrays.asList(itemNames).contains(itemAdding)){
            Arrays.fill(cartNames, itemAdding);
            System.out.println("adding this");
        }else{
            System.out.println("That is not in the list on items");
        }

    }
}
