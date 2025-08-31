    import java.util.Scanner;

    public class prime{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            boolean prime = true; 
            for (int i = 2; i < num; i++) {
                if (num%i==0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println("The given number is prime");
            }
            else System.out.println("The given number is not prime");

            sc.close();
        }
    }