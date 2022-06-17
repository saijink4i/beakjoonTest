import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        while (true) {
            try {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
            } catch (NoSuchElementException e) { // 더 이상 불러올것이 없을때
                break;                           // while문 종료
            }
            System.out.println(num1+num2);
        }
    }
}