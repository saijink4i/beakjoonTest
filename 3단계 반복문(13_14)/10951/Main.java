import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        while (true) {
            try {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            } catch (NoSuchElementException e) { // �� �̻� �ҷ��ð��� ������
                break;                           // while�� ����
            }
            System.out.println(num1+num2);
        }
    }
}