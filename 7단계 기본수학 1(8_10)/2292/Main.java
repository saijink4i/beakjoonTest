import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tempsum=1, count=1;

        for(int i=1 ; tempsum<number ; i++){
            count++;
            tempsum+=6*i;
        }
        System.out.println(count);
    }
}