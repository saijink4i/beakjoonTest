import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int i=0 ; i<testcase ; i++){
            int human = sc.nextInt();
            int score[] = new int[human];
            float aver=0;
            int count=0;
            for(int j=0 ; j<human ; j++){
                score[j] = sc.nextInt();
                aver += score[j];
            }
            aver/=human;
            for(int j=0 ; j<human ; j++){
                if(score[j]>aver)
                    count++;
            }
            System.out.printf("%.3f%%\n",(float)count/human*100);
        }
    }
}