import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int cross_count = 1, prev_count_sum = 0;
        while(true){
            if(number<=prev_count_sum+cross_count){
                if(cross_count%2==1){//�밢���� ������ Ȧ�����
                    //�и� ū ���ں��� ����. �и�� �밢�� ���� - (X��° - ���� �밢�������� ������ -1)
                    //���ڴ� X��° - ���� �밢�������� ������
                    System.out.println((cross_count -(number - prev_count_sum-1)) + "/" + (number - prev_count_sum));
                    break;
                }else {//�� �ݴ�
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