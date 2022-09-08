import java.io.*;

public class IFOP {
    public static void main(String[] args) {
        BufferedReader in;
        String Total = "";
        try {
            in = new BufferedReader(new FileReader("test"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 100000; i++) {
            try {
                if(in.readLine() == null){
                    i = 1000000000;
                }
                Total += in.readLine();
            } catch (IOException e) {

                throw new RuntimeException(e);
            }
            System.out.println(Total);
        }

    }
}
