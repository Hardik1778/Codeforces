import java.util.Scanner;

/**
 * Capitalization is writing a word with its first letter as a capital letter. Your task is to capitalize the given word.

    Note, that during capitalization all the letters except the first one remains unchanged.
    Input

    A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. The length of the word will not exceed 103.
    Output

    Output the given word after capitalization.
 **/

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        for (int i=0; i<str.length(); i++) {
            if (i==0 && str.charAt(i) > 91) {
                System.out.print(Character.toChars(str.charAt(i)-32));
            } else {
                System.out.print(str.charAt(i));
            }
        }
        s.close();
    }
}
