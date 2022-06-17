import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count=0;
        int rest[] = new int[42];

        for(int i=0 ; i<10 ; i++){
            num = sc.nextInt();
            rest[num%42]++;
        }

        for(int i=0 ; i<42 ; i++){
            if(rest[i]!=0)
                count++;
        }
        System.out.println(count);
    }
}