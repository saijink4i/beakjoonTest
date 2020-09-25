import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine();
        for(int i=0 ; i<testcase ; i++){
            String text = sc.nextLine();

            int repeat = Integer.parseInt(text.substring(0,1));
            text = text.substring(2);
            String eco = "";
            for(int j=0 ; j<text.length() ; j++){
                for(int z=0 ; z<repeat ; z++){
                    eco+=text.charAt(j);
                }
            }
            System.out.println(eco);
        }
    }
}