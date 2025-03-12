import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        // Please write your code here.
        for(int i = 0; i <n; i++){
            for(int j =0; j <n; j++){
                System.out.print(num + " ");
                num++;
                if(num == 10) num = 1;
            }
            System.out.println();
        }
    }
}