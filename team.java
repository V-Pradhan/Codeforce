import java.util.Scanner;

public class team {
    public static void main(String args[]){
        int sum =0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            int i3 = sc.nextInt();
            sum = i1 + i2 + i3;
            if(sum>=2){
                count++;
            }

        }
        System.out.println(count);
    }
    
}