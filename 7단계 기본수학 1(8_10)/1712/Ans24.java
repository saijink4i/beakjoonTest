import java.util.Scanner;

public class Ans24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        float score[] = new float[testcase];
        float total=0;

        for(int i=0 ; i<testcase ; i++){
            total+=score[i];
        }
        System.out.println("ÃÑÁ¡ : " + total);
        System.out.println("Æò±Õ : " + total/testcase);
    }
}
