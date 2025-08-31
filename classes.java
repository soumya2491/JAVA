import java.util.Scanner;

public class classes {
     class external{
        private int s;
         String name2;
        void display(String name, int s){
            System.out.println("hey what's up "+ name);
            System.out.println("you entered " + s);
        }
        static void display(String name){
            System.out.println("Hey there what's up buddy you know what i know your name lemme guess is it " + name +" Hahaha ");
        }
    }
    String name;
    private int age;
    classes(String name){
        this.name = name;
    }
    static void display(String name){
        System.out.println("Hey there " + name + " what's up!!");
    }
    void display(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        classes outerclass = new classes(name);
        // display(name);
        outerclass.age = sc.nextInt();
        System.out.println(outerclass.age);
        // System.out.println(outerclass.name);
        classes.external obj = outerclass.new external();
         int s = Integer.parseInt(sc.nextLine());
         obj.s = s;
         System.out.println(obj.s);
         String name2 = sc.nextLine();
         obj.name2 = name2;
         System.out.println(obj.name2);
        sc.close();
    }
}
