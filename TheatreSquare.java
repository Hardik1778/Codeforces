import java.util.Scanner;

/**
 * Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.

    What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.
    Input

    The input contains three positive integer numbers in the first line: n,  m and a (1 ≤  n, m, a ≤ 109).
    Output

    Write the needed number of flagstones.
 */

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long n = s.nextInt();
        long m = s.nextInt();
        int a = s.nextInt();
        long ans, row, col;

        row = (n%a==0) ? n/a : n/a+1;
        col = (m%a==0) ? m/a : m/a+1;
        ans = row*col;
        System.out.println(ans);

        s.close();
    }
}