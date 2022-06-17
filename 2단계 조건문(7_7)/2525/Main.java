import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] temp = sc.nextLine().split(" ");
        int nowHour = Integer.parseInt(temp[0]);
        int nowMin = Integer.parseInt(temp[1]);

        int time = Integer.parseInt(sc.nextLine());
        nowMin += time;

        while (nowMin>=60) {
            if(nowHour==23){
                nowHour=0;
                nowMin-=60;
            }else {
                nowHour++;
                nowMin-=60;
            }
        }

        System.out.println(nowHour +" "+ nowMin);
    }
}
