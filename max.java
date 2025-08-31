import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
