import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        String Input = JOptionPane.showInputDialog(null, "Enter Hey with x amount of e's");
        System.out.println(Input.replace("e", "ee"));
    }
}