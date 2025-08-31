import java.util.Scanner;

public class numhollow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if (j==1||j==2*i-1 ) {     
                    System.out.print(i);
                }else if (i==n) {
                    System.out.print(i);
                }else System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
