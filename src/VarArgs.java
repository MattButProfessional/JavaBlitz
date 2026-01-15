public class VarArgs {
//    static int add(int a, int b) {
//        return a + b;
//    }
//    static int add(int a, int b, int c) {
//        return a + b + c;
//    }
//    static int add(int a, int b, int c, int d) {
//        return a + b + c + d;

//    }

    static int add(int... numbers){
        int sum = 0;
        for(int num:numbers){
            sum+=num;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(add(1, 2));         // Output: 3
        System.out.println(add(1, 2, 3));      // Output: 6
        System.out.println(add(1, 2, 3, 4));   // Output: 10
        System.out.println(add(1, 2, 3, 4, 5));   // Output: 15
        System.out.println(add(1, 2, 3, 4, 5, 6));   // Output: 21
    }

}
