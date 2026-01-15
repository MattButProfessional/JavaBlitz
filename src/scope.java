public class scope {
    static String classVar = "Mr. Kennedy's amazing class variable.";


    public static void main(String[] args) {
        String anotherVar = "Mrs. Kennedy's local class variable";
        String classVar = "Mr. Steinbrenner's local class variable";
        System.out.println(classVar);
        System.out.printf("%s is hanging out with %s\n",anotherVar,classVar);
        System.out.printf("%s",scope.classVar);

    }

    public static void printSomething() {
        System.out.println(classVar);
    }
}
