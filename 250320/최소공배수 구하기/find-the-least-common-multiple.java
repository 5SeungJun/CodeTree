import java.util.*;

public class Main {
    // 최대공약수(GCD) 구하는 함수 (유클리드 호제법 사용)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int lcm = (n * m) / gcd(n, m);
        
        System.out.println(lcm);
    }
}
