public class Main {
    public static void main(String[] args) {
        int certCount = 1000;
        int[] certNumbers = new int[certCount];
        for(int i = 0; i < certNumbers.length; i++){
            certNumbers[i] = 1_000_000 + (int)Math.round(8_999_999 * Math.random());
        }

        for (int i = 0; i < certNumbers.length; i++) {
            System.out.println(certNumbers[i]);
        }
    }
}
