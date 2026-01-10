import java.util.Scanner;

public class bear_bigbro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // Limak
        int b = sc.nextInt(); // Bob

        int years = 0;

        while (a <= b) {
            a *= 3;
            b *= 2;
            years++;
        }

        System.out.println(years);
    }
}
