import javax.swing.JOptionPane;
public class GUI{
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Enter your name: ");
        String strage = JOptionPane.showInputDialog("Enter your age: ");
        int age = Integer.parseInt(strage);
        JOptionPane.showMessageDialog(null,"Hello "+ input+ " you are "+ age+" years old");
    }
}