import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alphabet[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        String text = sc.nextLine();
        for(int i=0 ; i<text.length() ; i++){
            for(int j=0 ; j<alphabet.length ; j++){
                if(text.charAt(i)==(char)('a'+j)){
                    if(alphabet[j]!=-1)
                        break;
                    alphabet[j]=i;
                    break;
                }
            }
        }
        for(int i=0 ; i<alphabet.length ; i++){
            System.out.print(alphabet[i]);
            if(i!=alphabet.length-1)
                System.out.print(" ");
        }
    }
}