import javax.swing.*;

public class hiss {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter a word");
        if(s.contains("ss")){
            System.out.println("hiss");
        }
        else{
            System.out.println("no hiss");
        }
    }
}
