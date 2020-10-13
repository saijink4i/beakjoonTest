import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();
        
        System.out.println((int)Math.ceil((double)(height-up)/(up-down)+1));

    }
}