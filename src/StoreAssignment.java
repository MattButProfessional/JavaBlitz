import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class StoreAssignment {
    public static Scanner myScanner = new Scanner(System.in);

    public static String[] itemNames = {"chips", "granola bar", "cookies","water", "soda", "juice", "pencil", "notebook", "eraser"};
    public static double[] itemPrices = {4.99, .99 , 3.99, 1, 2.99, 3.99, 2.99, 1.99, .99};
    public static int[] itemStock = {60, 50 , 5, 100, 20, 10, 1000, 20, 100};

    public static String[] cartNames = new String[9]; //Holds the items
    public static int[] cartQty = new int[9];

    public static String[][] categoryItems = {
            {"Snacks", "Chips", "Granola Bar", "Cookies"},
            {"Drinks", "Water", "Soda", "Juice"},
            {"Supplies", "Pencil", "Notebook", "Eraser"} };



    public static void main(String[] args) {
        boolean quitStore = false;
        int menuOption;
        do{
            menuOption = menu();
            switch (menuOption){
               case 1: {
                   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                   categoryView();
                   break;}
               case 2: {
                   System.out.println("Searching");
                   searchItems();
                   break;}
               case 3: {
                   System.out.println("Viewing cart");
                   break;}
               case 4: {
                   System.out.println("Checking out ");
                   break;}
               case 5: {
                   System.out.print(((char)27 +"[31m") + "BYE!" + ((char)27 +"[0m"));
                   quitStore = true;
                   break;}
               default: {
                   System.out.println("Try again");}
            }
        }while (!quitStore);
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
        int choice = myScanner.nextInt();
        myScanner.nextLine();
        return choice;
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
        System.out.print("\nWould you like to purchase an item? -> ");
        String purchaseQuestion = myScanner.next().toLowerCase().trim();

        if (purchaseQuestion.equals("yes") || purchaseQuestion.equals("y")){
            System.out.print("What item would you like to add to your cart? -> ");
            String itemAdding = myScanner.next().toLowerCase().trim();
            addItemToCart(itemAdding);
        } else if (purchaseQuestion.equals("no") || purchaseQuestion.equals("n")){
            System.out.println("back to menu");
        }else{
            System.out.println("\nERROR: Please use \"yes\" or \"no\" ");
        }

    }

    public static void addItemToCart(String itemAdding) {
        if (Arrays.asList(itemNames).contains(itemAdding)){
            System.out.print("How many of this item do you want? -> ");
            int itemAmount = myScanner.nextInt();

            if (itemAmount >= 0 ){

                for (int j = 0; j < itemStock.length; j++) {
                    if(Objects.equals(itemNames[j], itemAdding)){

                        if (itemStock[j] - itemAmount < 0){
                            System.out.println(((char)27 +"[31m") + "\nItem amount invalid\n" + ((char)27 +"[0m"));
                        } else if(itemStock[j] - itemAmount == 0) {
                            System.out.println(((char)27 +"[31m") + "\nItem out of stock\n" + ((char)27 +"[0m"));

                        }

                        else{
                            cartQty[j] = itemAmount;
                            System.out.println(itemStock[j]);
                            itemStock[j] -= itemAmount;
                            System.out.println(itemStock[j]);
                            cartNames[j] = itemAdding;

                            System.out.println(((char)27 +"[32m") + "\nItems added to cart.\n" + ((char)27 +"[0m"));
                            return;
                        }
                    }
                }
            } else{
                System.out.println(((char)27 +"[31m") + "\nInvalid Amount\n" + ((char)27 +"[0m"));
            }

        }else{
            System.out.println(((char)27 +"[31m") + "\nThat is not in the list on items\n" + ((char)27 +"[0m"));
        }
    }

    public static void searchItems() {
        System.out.print("What item would you like to search for? -> ");
        String searchQuery = myScanner.next().toLowerCase().trim();
        if (Arrays.asList(itemNames).contains(searchQuery)){
            for (int i = 0; i < itemNames.length; i++) {
                if (Objects.equals(itemNames[i], searchQuery)) {
                    System.out.printf("\nWe still have %s of that still in stock",itemStock[i]);
                    break;
                }
            }

        }else{
            System.out.println("That item does not exist");
        }

        }
}
