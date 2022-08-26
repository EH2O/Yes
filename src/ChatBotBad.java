import java.util.Scanner;
import java.util.Random;
public class ChatBotBad {
    public static void main(String[] args) {
        Random rand = new Random();
        String His = "";
        int int_random = rand.nextInt(5);
        int int_random2 = rand.nextInt(3);
        Scanner myObj = new Scanner(System.in);
        String [] hej = {"Hej", "Hejsan","Goddag", "Hej Hej", "helooo"};
        String [] vad = {"vad vill du prata om?", "vad är det du skulle vilja prata om?", "vad ska vi prata om?" };
        String [] talking = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
            System.out.println(hej[int_random]+" "+ vad[int_random2]);
            int_random = rand.nextInt(9);
            int_random2 = rand.nextInt(20);
        for (int i = 0; i < int_random2; i++) {
            String que = myObj.nextLine();
            System.out.println(que);
            System.out.println(talking[int_random]);
            int_random = rand.nextInt(9);
            His += que + " | ";
            if(i == int_random2-1){
                System.out.println("Slut med tid");
            }
        }
        System.out.println(His);

    }
}
