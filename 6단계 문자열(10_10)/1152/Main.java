import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim(); // ��ǲ �� �� ���� ��������
        sc.close();
        
        if(text.isEmpty()) { // ��ǲ���� �ƿ� ������ üũ
            System.out.println(0);
        }else {
            System.out.println(text.split(" ").length);
        }
    }
}