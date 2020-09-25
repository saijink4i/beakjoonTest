import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim(); // 인풋 값 앞 뒤의 공백제거
        sc.close();
        
        if(text.isEmpty()) { // 인풋값이 아예 없는지 체크
            System.out.println(0);
        }else {
            System.out.println(text.split(" ").length);
        }
    }
}