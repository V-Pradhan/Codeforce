import java.util.*;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of students
        int t = sc.nextInt();   // time in seconds
        sc.nextLine();          // consume leftover newline

        String s = sc.nextLine(); // queue string

        char[] arr = s.toCharArray();

        for (int sec = 0; sec < t; sec++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++; // skip next index
                }
            }
        }

        System.out.println(new String(arr));
        sc.close();
    }
}
