import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int winnersRate = 100;
        int certCount = 1000;
        int[] certNumbers = new int[certCount];
        ArrayList<Integer> winnersCarts = new ArrayList<>();
        for(int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            if (i % winnersRate == 0) {
                winnersCarts.add(certNumbers[i]);
            }
        }


        for (int i = 0; i < winnersCarts.size(); i++) {
            System.out.println(winnersCarts.get(i));
        }
    }
}
