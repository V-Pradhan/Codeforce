    import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String prev = sc.next();

        int groups = 1;  // first magnet always forms a group

        for (int i = 1; i < n; i++) {
            String curr = sc.next();

            // If right pole of previous == left pole of current
            if (prev.charAt(1) == curr.charAt(0)) {
                groups++;
            }

            prev = curr;
        }

        System.out.println(groups);
        sc.close();
    }
}

    

