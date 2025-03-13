import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = Math.min(n,m);
        int maxNum = 0;
        // Please write your code here.
        for(int i = min; i >0; i--){
            if(n%i == 0 && m%i == 0){
                maxNum = i;
                break;
                }
            }
        System.out.println(maxNum);
    }
}