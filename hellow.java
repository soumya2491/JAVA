import javax.swing.JOptionPane;

public class hellow{
    public static void main(String[] so){
        String agestr = JOptionPane.showInputDialog("Enter your age: ");
        int age = Integer.parseInt(agestr);
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Hey there your name is "+ name + " and your age is " + age);
    }
}