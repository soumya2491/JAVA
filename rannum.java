import java.util.Random;

public class rannum {
    public static void main(String[] args) {
        Random num = new Random();
        int age = Math.abs(num.nextInt()%10 + 1);
        System.out.println("Your age is "+ age);
    }
}
