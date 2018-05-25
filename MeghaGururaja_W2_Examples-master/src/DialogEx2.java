import javax.swing.JOptionPane;

public class DialogEx2 {
    public static void main(String[] args) {
        //promt user to enter the name
        String name =JOptionPane.showInputDialog("What is your name ?");

        //create custom message
        String message=String.format("Welcome, %s, to Java programming!",name);

        JOptionPane.showMessageDialog(null,message);
    }

}
