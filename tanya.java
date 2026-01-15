import java.util.Scanner;

public class tanya {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            if (n % 10 != 0) {
                n--;
            } else {
                n /= 10;
            }
        }

        System.out.println(n);
    }
}

    