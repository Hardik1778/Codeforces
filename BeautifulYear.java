import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();

        while (true) {
            y++;
            if (isDistinct(y)) {
                System.out.println(y);
                break;
            }
        }

        s.close();
    }

    public static boolean isDistinct(int year) {
        String str = Integer.toString(year);
        ArrayList<Character> arr = new ArrayList<>();

        for (int i=0; i<4; i++) {
            if (!(arr.contains(str.charAt(i)))) {
                arr.add(str.charAt(i));
            }
        }
        if (arr.size() == 4) {
            return true;
        }
        return false;
    }
}
