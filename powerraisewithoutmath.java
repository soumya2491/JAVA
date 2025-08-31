import java.util.Scanner;

public class powerraisewithoutmath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int s = input.nextInt();
        int so = 1;
        while (s>0) {
            so*=i;
            s--;
        }
        System.out.println(so);
        input.close();
    }
}
