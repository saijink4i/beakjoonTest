import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] temp = sc.nextLine().split(" ");
        int firstNum = Integer.parseInt(temp[0]);
        int secondNum = Integer.parseInt(temp[1]);
        int thirdNum = Integer.parseInt(temp[2]);

        int cnt = 0;
        int onaji = 0;
        if(firstNum==secondNum){
            cnt++;
            onaji = firstNum;
        }
        if(firstNum==thirdNum){
            cnt++;
            onaji = firstNum;
        }
        if(secondNum==thirdNum){
            cnt++;
            onaji = secondNum;
        }
            

        if(cnt==3){
            System.out.println(10000 + onaji*1000);
        }else if(cnt==1){
            System.out.println(1000 + onaji*100);
        }else {
            System.out.println(Math.max(Math.max(firstNum, secondNum), thirdNum)*100);
        }
    }
}
