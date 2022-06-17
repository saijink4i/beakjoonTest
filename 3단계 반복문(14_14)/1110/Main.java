import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int save = sc.nextInt();
        int temp=save, count=0;
        while (true) {
            temp=(temp%10)*10+((temp%10)+(temp/10))%10;
            count++;
            System.out.println(temp + " ");

            if(temp==save)
                break;
        }
        System.out.println(count);
    }
}