import java.util.Random;
public class cancer {
    public static void main(String[] args) {
        int highest = 0;
        int highest2 = 0;
        int current1 = 0;
        int current2 = 0;
        Random rand = new Random();
        int int_random = rand.nextInt(2);
        for (int i = 0; i < 1000000000; i++) {
            if(int_random == 1){
                current1++;
                if(highest<current1){
                    highest = current1;
                }
            }
            else{
                current1 = 0;
            }
            if(int_random == 0){
                current2++;
                if(highest2<current2){
                    highest2 = current2;
                }
            }
            else{
                current2 = 0;
            }
            int_random = rand.nextInt(2);
        }
        System.out.println(highest + " " + highest2);
    }
}
