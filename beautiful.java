    import java.util.HashSet;
import java.util.Scanner;
public class beautiful {


    static boolean hasDistinctDigits(int year) {
        HashSet<Integer> set = new HashSet<>();

        while (year > 0) {
            int digit = year % 10;
            if (set.contains(digit))
                return false;
            set.add(digit);
            year /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        y++;
        while (!hasDistinctDigits(y)) {
            y++;
        }

        System.out.println(y);
    }
}

    

