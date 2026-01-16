import java.util.Scanner;

public class NearlyLucky {

    // Function to check if a number is lucky
    static boolean isLucky(long num) {
        if (num == 0) return false;

        while (num > 0) {
            long digit = num % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();   // Read as string (safe for 10^18)
        int count = 0;

        // Count lucky digits
        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                count++;
            }
        }

        // Check if count is lucky
        if (isLucky(count)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

    

