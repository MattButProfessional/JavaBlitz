import java.util.Arrays;

public class arrays {
    static String[] fruits = {"Apple", "Orange", "Banana", "Alex"};

    public static void main(String[] args) {
        System.out.println(fruits);
        System.out.println(fruits[3]);
        System.out.println(fruits.length);

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println();

        for(String fruit:fruits){
            System.out.println(fruit);
        }

        System.out.println();

        Arrays.sort(fruits);

        for(String fruit:fruits){
            System.out.println(fruit);
        }

        System.out.println();

        Arrays.fill(fruits, "Tomato");


        for(String fruit:fruits){
            System.out.println(fruit);
        }

    }


}
