import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        String text = sc.nextLine();
        String num[] = text.split(" ");
        String result="";

        for(int i=0 ; i<testcase ; i++){   
            if(x>Integer.parseInt(num[i])){
                result+=num[i]+" ";
            }
        }
        result=result.substring(0, result.length()-1);
        System.out.println(result);
    }
}