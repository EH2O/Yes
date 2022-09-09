import java.io.*;
public class ToBin {
    public static void main(String[] args) {
        int x;
        String p;
        DataOutputStream output;
        try {
            output = new DataOutputStream (new BufferedOutputStream(new FileOutputStream("test.dat")));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader in;

        try {
            in = new BufferedReader(new FileReader("numbers"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 1920*1080; i++) {
            try {
                p = in.readLine();
                if(p == null){
                    break;
                }
                else{
                    x = Integer.parseInt(p);

                    output.writeInt(x);

                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
