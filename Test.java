import java.util.Scanner;

class Person {
    String name; 
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p = new Person();     

        System.out.print("Enter name: ");
        p.name = sc.nextLine();       

        System.out.println("Hello, " + p.name);

        sc.close();
    }
}
