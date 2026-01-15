public class ArraysTwoDimensional {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {
                {"apple", "orange", "banana"},
                {"potato", "onion", "carrot"},
                {"chicken", "pork", "beef", "fish"}
        };

        groceries[1][2] = "Tony";

        for (String[] grocery:groceries){
            for (String item:grocery){
                System.out.println(item);
            }


        }



    }
}
