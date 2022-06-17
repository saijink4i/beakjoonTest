import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int cross_count = 1, prev_count_sum = 0;
        while(true){
            if(number<=prev_count_sum+cross_count){
                if(cross_count%2==1){//대각선의 갯수가 홀수라면
                    //분모가 큰 숫자부터 시작. 분모는 대각선 개수 - (X번째 - 직전 대각선까지의 누적합 -1)
                    //분자는 X번째 - 직전 대각선까지의 누적합
                    System.out.println((cross_count -(number - prev_count_sum-1)) + "/" + (number - prev_count_sum));
                    break;
                }else {//그 반대
                    System.out.println((number - prev_count_sum) + "/" + (cross_count -(number - prev_count_sum-1)));
                    break;
                }    
            }else {
                prev_count_sum +=cross_count;
                cross_count++;
            }
        }
    }
}