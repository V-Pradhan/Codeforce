    import java.util.Scanner;

public class Gifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n + 1];
        int[] ans = new int[n + 1];

        // Input: p[i] = friend to whom i gave the gift
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }

        // Reverse mapping
        for (int i = 1; i <= n; i++) {
            ans[p[i]] = i;
        }

        // Output result
        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }


    
}
