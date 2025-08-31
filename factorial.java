import java.util.Scanner;
public class factorial {
     int calcfactorial(int s){
        if (s<=1) {
            return 1;
        }
        else return s*calcfactorial(s-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        factorial s = new factorial();
        
        for (int i = 0; i < num; i++) {
           System.out.println(s.calcfactorial(i+1));
        }
        input.close();
    }
}
