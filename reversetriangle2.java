import java.util.Scanner;

public class reversetriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i>0) {
                  for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n-i; j > 0; j--) {
                System.out.print("* ");
            }
            }else{
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}