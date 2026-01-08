import java.util.*;
public class helpfulmaths {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
            //to saperate the numbers from + sign we use \\ for regex 
        String nums[] = s.split("\\+");
        Arrays.sort(nums);
        System.out.println(String.join("+",nums));
    }
    
}
