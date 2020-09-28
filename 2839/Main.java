import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int n5, n3, min=0;
        
        for(n5=0 ; n5*5<=sugar ; n5++){
            for(n3=0 ; (n5*5+n3*3)<=sugar ; n3++){
                if((n5*5+n3*3)==sugar){
                    if(min==0){
                        min=n5+n3;
                    }else if(min>(n5+n3)){
                        min=n5+n3;
                    }
                }
            }
        }
        if(min==0){
            System.out.println("-1");
        }else {
            System.out.println(min);
        }
    }
}