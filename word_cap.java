import java.util.*;
public class word_cap {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
            char first_letter = Character.toUpperCase(s.charAt(0));
            System.out.println(first_letter+s.substring(1));

    }
    
}
