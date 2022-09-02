import javax.swing.*;

public class Encrypt {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number"));
        int key = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the Key?"));
        System.out.println(maow(x, key));
    }
    static int maow(int x, int y){
        int z = x^y;
        return z;
    }
}
