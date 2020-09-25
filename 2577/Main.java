import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long result=1;
        int num[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i=0 ; i<3 ; i++){
            int temp = sc.nextInt();
            result*=temp;
        }
        while(result!=0){
            for(int i=0 ; i<10 ; i++){
                if(result%10==i){
                    num[i]++;
                    break;
                }
            }
            result/=10;
        }
        for(int i=0 ; i<10 ; i++){
            System.out.println(num[i]);
        }
    }
}