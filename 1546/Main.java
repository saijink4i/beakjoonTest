import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int score[] = new int[testcase];
        int max = 0;
        float aver=0;

        for(int i=0 ; i<testcase ; i++){
            score[i] = sc.nextInt();
            aver += score[i];
            if(max<score[i])
                max = score[i];
        }
        System.out.println(aver/max*100/testcase);
    }
}