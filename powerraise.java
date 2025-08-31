import java.util.Scanner;

public class powerraise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num =  s.nextInt();
        int num2 = s.nextInt();
        System.out.println(Math.pow(num, num2));
        s.close();
    }
}
