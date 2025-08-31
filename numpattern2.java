import java.util.Scanner;

public class numpattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if ((i+j)%2==0) {
                    System.out.print(1);
                }else System.out.print(2);
            }
            System.out.println();
        }

        sc.close();
    }
}
