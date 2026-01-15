public class methodOVERLOAD {
    public static void main(String[] args) {
        double result = add(9,14.5);
        System.out.printf("9 + 14.5 = %.2f\n", result);
        double result2 = add(9,14.5, 6);
        add("OVERLOADED!", 9,4);
    }
    public static double add(double a, double b){
        return a + b;
    }

    //overload the add func to accept a different number of parameters
    public static double add(double a, double b, double c){
        return a + b + c;
    }

    public static void add(String msg, double a, double b){
        System.out.printf("%s\n",msg);
        System.out.printf("%.2f + %.2f = %.2f",a,b,a+b);
    }
}
