import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        String number = sc.nextLine();
        int result = 0;

        for(int i=0 ; i<testcase ; i++){
            result+=number.charAt(i)-48;
        }
        System.out.println(result);
    }
}