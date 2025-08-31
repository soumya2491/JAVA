import java.util.Scanner;
public class reversenum{
    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int digit = 0;
        int temp = n;
        while (temp > 0) {
            int s = temp%10;
            digit = digit*10 + s;
            temp/=10;
        }
        System.out.println(digit);
        num.close();
    
    }
}