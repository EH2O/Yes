import java.io.*;
import java.util.Random;
public class gennumber {
    public static void main(String[] args) {
        File fout = new File("numbers");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fout);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        BufferedWriter numb = new BufferedWriter(new OutputStreamWriter(fos));
        Random rand = new Random();
        int x;
        for (int i = 0; i < 1920*1080; i++) {
            x = rand.nextInt(0xffffff);
            try {
                numb.write("" + x);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                numb.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
