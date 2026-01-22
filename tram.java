    import java.util.Scanner;

public class tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int current = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // passengers exiting
            int b = sc.nextInt(); // passengers entering

            current -= a;   // exit first
            current += b;   // then enter

            if (current > maxCapacity) {
                maxCapacity = current;
            }
        }

        System.out.println(maxCapacity);
        sc.close();
    }
}

    
