import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = num1 + num2;

            System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + result);
        }
    }
}