import java.util.*;
public class Main {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int num[] = new int[testcase];



        int min=1000000, max=-1000000;

        for(int i = 0; i<testcase ; i++){
            num[i]=sc.nextInt();
            if(min>num[i]){
                min=num[i];
            }
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println(min + " " + max);
    }
}