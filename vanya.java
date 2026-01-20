import java.util.*;

public class vanya {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int totalWidth = 0;

        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt();
            if (ai > h) {
                totalWidth += 2;   // bent person
            } else {
                totalWidth += 1;   // normal person
            }
        }

        System.out.println(totalWidth);
        sc.close();
    }
}

    

