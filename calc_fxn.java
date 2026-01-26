import java.util.*;

public class calc_fxn {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); // use long because n ≤ 10^15

        if (n % 2 == 0) {
            System.out.println(n / 2);
        } else {
            System.out.println(-(n + 1) / 2);
        }
    }
}

    

