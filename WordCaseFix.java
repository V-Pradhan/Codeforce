    import java.util.Scanner;

public class WordCaseFix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int upper = 0;
        int lower = 0;

        // Count uppercase and lowercase letters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else {
                lower++;
            }
        }

        // Apply rule
        if (upper > lower) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }

        sc.close();
    }
}

    

