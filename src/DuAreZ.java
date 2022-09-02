import javax.swing.*;

public class DuAreZ {
    public static void main(String[] args) {
        String ToEnOrDe = JOptionPane.showInputDialog(null, "Enter the message to encrypt or decrypt");
        String Key = JOptionPane.showInputDialog(null, "Enter the key");
        String CrypOrDe = "";
        String test ="";
        String Temp = "";
        String Temps = "";
        int x = 0;
        if(ToEnOrDe.charAt(0) == '0' && ToEnOrDe.charAt(1) == 'X')
        {
            ToEnOrDe = ToEnOrDe.substring(2, ToEnOrDe.length());

            for(int y = 0; y < ToEnOrDe.length(); y += 2) {
                Temp = ""+ToEnOrDe.charAt(y)+""+ToEnOrDe.charAt(y+1);
                char character = (char) Integer.parseInt(Temp, 16);
                test += character;
            }
            for (int i = 0; i < test.length(); i++) {
                if (x >= Key.length()) {
                    x = 0;
                }
                CrypOrDe += (char)maow(test.charAt(i), Key.charAt(x));
                x++;
            }

        }
       else{

            for (int i = 0; i < ToEnOrDe.length(); i++) {
                if(x >= Key.length()){
                    x = 0;
                }
                Temps = Integer.toHexString(maow(ToEnOrDe.charAt(i), Key.charAt(x)));
                if(Temps.length() != 2){
                    Temps = '0' + Temps;
                }
                CrypOrDe += Temps;
                x++;
            }
        }


        System.out.println(CrypOrDe);
    }
    static int maow(char x, char y){
        int z = x^y;
        return z;
    }


}
