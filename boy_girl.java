import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class boy_girl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        Set<Character> distinctChars = new HashSet<>();

        for (char ch : username.toCharArray()) {
            distinctChars.add(ch);
        }

        if (distinctChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}

    
