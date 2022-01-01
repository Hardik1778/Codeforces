import java.util.Arrays;
import java.util.Scanner;

/**
 * Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

    The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

    You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.
    Input

    The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.
    Output

    Print the new sum that Xenia can count.
 */

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        int arr[] = new int[str.length()/2+1];

        for (int i=0; i<str.length(); i+=2) {
            arr[i/2] = Character.getNumericValue(str.charAt(i));
        }

        Arrays.sort(arr);

        for (int a=0; a<arr.length; a++) {
            System.out.print(arr[a]);
            if (a==arr.length-1) {
                break;
            }
            System.out.print("+");
        }
        s.close();
    }
}
