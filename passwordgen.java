import java.util.Random;

public class newClass{
    public static void main(String[] args) {
        int length = 10;
        System.out.println(genpass(length));
    }
    static String genpass(int len)
    {
        if (len <= 0) {
            return "";
        }

        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%&";
        String combinedChars = Capital_chars + Small_chars + numbers + symbols;

        Random randgenpass = new Random();
        StringBuilder password = new StringBuilder(len);

        if (len >= 4) {
            password.append(Capital_chars.charAt(randgenpass.nextInt(Capital_chars.length())));
            password.append(Small_chars.charAt(randgenpass.nextInt(Small_chars.length())));
            password.append(numbers.charAt(randgenpass.nextInt(numbers.length())));
            password.append(symbols.charAt(randgenpass.nextInt(symbols.length())));
        }

        for (int i = password.length(); i < len; i++) {
            password.append(combinedChars.charAt(randgenpass.nextInt(combinedChars.length())));
        }

        // Shuffle the characters to ensure randomness
        for (int i = 0; i < len; i++) {
            int randomIndexToSwap = randgenpass.nextInt(len);
            char temp = password.charAt(randomIndexToSwap);
            password.setCharAt(randomIndexToSwap, password.charAt(i));
            password.setCharAt(i, temp);
        }

        return password.toString();
    }
}
