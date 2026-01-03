import java.util.*;
public class bit_pp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int x = 0;
        for(int i=1;i<=n;i++){
            String ch = sc.nextLine();
            if(ch.contains("++")){
                x = x+1;
            }
            else {
                x = x-1;
            }
        }
        System.out.println(x);
    }
}