import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int targetLength = sc.nextInt();

        int [] arr = new int [length];
        int [] targetArr = new int [targetLength];
        for(int i = 0; i < length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < targetLength; i++){
            targetArr[i] = sc.nextInt();
        }
        
        boolean isSequence = false;
        for(int i = 0; i <= length - targetLength; i++){
            boolean same = true;

            for(int j = 0; j < targetLength; j++){
                if(arr[i+j] != targetArr[j]){
                    same = false;
                    break;
                }
            }
            if(same){
                isSequence = true;
                break;
            }
        }
        System.out.println(isSequence ? "Yes" : "No");
    }
}