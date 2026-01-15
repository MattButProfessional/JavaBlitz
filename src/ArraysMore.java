import java.util.Scanner;

public class ArraysMore {
    public static void main(String[] args) {
        String[] foods = new String[3];
        foods[0] = "hamburger";
        System.out.println(foods[0]);
        Scanner s = new Scanner(System.in);
        for(int i =0; i<foods.length; i++){
            System.out.printf("Please enter a food -> ");
            foods[i] = s.nextLine();
        }

        for (String food:foods){
            System.out.println(food);
        }

        String[] dessert;
        int size = 5;
        dessert = new String[size];

        int[] numbers = new int[]{10,20,30};
        System.out.println(SearchArray(numbers,23));
    }

    public static int SearchArray(int[] arr, int searchNum) {
        for (int num=0;num<arr.length;num++){
            if(arr[num] == searchNum){
                System.out.println("Found it!");
                return num;
            }
        }
        return -1;
    }
}
