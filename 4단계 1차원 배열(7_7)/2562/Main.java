import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[9];
        int max=-1000000, count=0;

        for(int i = 0; i<9 ; i++){
            num[i]=sc.nextInt();
            if(max<num[i]){
                max=num[i];
                count=i+1;
            }
        }
        System.out.println(max + "\n" + count);
    }
}