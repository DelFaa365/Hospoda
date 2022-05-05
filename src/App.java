import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sken = new Scanner(System.in);
        int t = sken.nextInt();
        while(t > 0){
            int [] poleCasy = new int[6];
            for (int j = 0; j < 6; j++) {
                poleCasy[j] = sken.nextInt();
            }
            if(poleCasy[2] < 10){
                poleCasy[2]+=24;
            }
            if((poleCasy[0] <= poleCasy[4] && poleCasy[1] <= poleCasy[5]) && (poleCasy[2] >= poleCasy[4] && poleCasy[3] >= poleCasy[5])){
                System.out.println("Otevřeno");
            } else {
                System.out.println("Zavřeno");
            }
            t--;
        }
    }
}
