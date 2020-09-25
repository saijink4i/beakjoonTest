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

            if(prev != now){ // 앞선 문자와 i번째 문자가 같지 않다면
                if( check[now-'a']==false){ // 해당 문자가 처음 나오는 경우
                    check[now-'a']=true;
                    prev=now;
                }else{  //해당 문자가 처음 나오는 경우가 아닌경우
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
}