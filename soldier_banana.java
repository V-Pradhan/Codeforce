import java.util.Scanner;

public class soldier_banana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        int k = sc.nextInt(); // cost of first banana
        int n = sc.nextInt(); // money he has
        int w = sc.nextInt(); // number of bananas

        // Calculate total cost
        int totalCost = k * w * (w + 1) / 2;

        // Calculate borrowed money
        int borrow = totalCost - n;

        // If no need to borrow
        if (borrow < 0) {
            borrow = 0;
        }

        // Output result
        System.out.println(borrow);

        sc.close();
    }
}
