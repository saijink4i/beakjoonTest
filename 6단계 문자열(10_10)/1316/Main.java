import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        int count=0;
        for(int i=0 ; i<testcase ; i++){
            String text = sc.nextLine();
            if(check(text)){
                count++;
            }else {
                continue;
            }
        }
        System.out.println(count++);
    }

    public static boolean check(String text){
        boolean check[] = new boolean[26];
        int prev = 0;
        for(int i=0 ; i<text.length() ; i++){
            int now = text.charAt(i);

            if(prev != now){ // �ռ� ���ڿ� i��° ���ڰ� ���� �ʴٸ�
                if( check[now-'a']==false){ // �ش� ���ڰ� ó�� ������ ���
                    check[now-'a']=true;
                    prev=now;
                }else{  //�ش� ���ڰ� ó�� ������ ��찡 �ƴѰ��
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
}