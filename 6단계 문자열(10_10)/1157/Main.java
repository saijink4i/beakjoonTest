import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int alphabet[] = new int[26];
        int max=0, save=0;
        for(int i=0 ; i<text.length() ; i++){
            if((text.charAt(i)>=97)&&(text.charAt(i)<=122)){
                alphabet[text.charAt(i)-97]++;
            }else {
                alphabet[text.charAt(i)-65]++;
            }
        }
        for(int i=0 ; i<alphabet.length ; i++){
            if(alphabet[i]>max){
                max=alphabet[i];
                save=i;
            }else {
                if(alphabet[i]==max){
                    save=-1;
                }
            }
        }
        if(save==-1){
            System.out.println("?");
        }else{
            System.out.println((char)('A'+save));
        }
    }
}