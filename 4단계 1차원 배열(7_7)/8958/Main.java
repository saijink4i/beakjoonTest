import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        String result[] = new String[testcase];
        int score=0, count=0;
        
        for(int i=0 ; i<testcase ; i++){
            result[i] = sc.nextLine();
            for(int j=0 ; j<result[i].length() ; j++){
                if(result[i].charAt(j)=='O'){
                    score+=1+count;
                    count++;
                }else {
                    count=0;
                }
            }
            System.out.println(score);
            score=0;
            count=0;
        }
    }
}