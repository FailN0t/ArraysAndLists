public class Main {
    public static void main(String[] args) {
        int certCount = 1000;
        int[] certNumbers = new int[certCount];
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
        }

        int winnersRate = 100;
        int[] winnerNumbers = new int[certNumbers.length / winnersRate];
        int win = 0;
        for (int i = 0; i < certNumbers.length; i += winnersRate) {
            winnerNumbers[win++] = certNumbers[i];
        }
        for (int i:winnerNumbers) {
            System.out.println(i);
        }
    }
}
