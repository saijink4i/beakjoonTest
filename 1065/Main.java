import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        for(int i=1 ; i<=num ; i++){
            int copy=i, temp1=0, temp2=copy%10 - copy/10%10;
            if(copy<10){
                count++;
            }else {
                while (copy>=10) {
                    temp1=copy%10 - copy/10%10;
                    if(temp1!=temp2){
                        break;
                    }
                    copy/=10;
                }
                if(temp1==temp2){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}