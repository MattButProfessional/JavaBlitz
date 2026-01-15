import java.util.Random;
public class RandomNums {
    public static void main(String[] args) {
        //get a random object:
        Random random = new Random();
        int randNum = random.nextInt();
        System.out.println(randNum);

        int randNum2 = random.nextInt(6);
        System.out.println(randNum2);
    }
}
