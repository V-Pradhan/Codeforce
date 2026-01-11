import java.util.Scanner;

public class elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        // Minimum steps using ceiling division
        int steps = (x + 4) / 5;
        
        System.out.println(steps);
        
        sc.close();
    }
}
