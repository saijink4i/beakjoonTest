import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int testcase=sc.nextInt() ; testcase>0 ; testcase--){
            int height = sc.nextInt();
            int wight = sc.nextInt();
            int number = sc.nextInt();
            int result=0;
            if(number%height==0){
                result+=height*100+(number/height);
            }else {
                result+=number%height*100+(number/height+1);
            }
            System.out.println(result);
        }
    }
}