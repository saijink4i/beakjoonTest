import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;
        for(int i=0 ; i<text.length() ; i++){
            if(i<(text.length()-2)){  //dz=는 두칸의 여유가 있어야함
                if(text.charAt(i)=='d'){
                    if((text.charAt(i+1)=='z')&&(text.charAt(i+2)=='=')){
                        i+=2;
                    }
                }
            }
            if(i<(text.length()-1)){    //나머지는 한칸의 여유가 있어야함
                if(text.charAt(i)=='c'){    //c일경우
                    if(text.charAt(i+1)=='='){
                        i++;
                    }else if(text.charAt(i+1)=='-'){
                        i++;
                    }
                }else if(text.charAt(i)=='d'){  //d일경우
                    if(text.charAt(i+1)=='-'){
                        i++;
                    }
                }else if(text.charAt(i)=='l'){  //l일경우
                    if(text.charAt(i+1)=='j'){
                        i++;
                    }
                }else if(text.charAt(i)=='n'){  //n일경우
                    if(text.charAt(i+1)=='j'){
                        i++;
                    }
                }else if(text.charAt(i)=='s'){  //s일경우
                    if(text.charAt(i+1)=='='){
                        i++;
                    }
                }else if(text.charAt(i)=='z'){  //z일경우
                    if(text.charAt(i+1)=='='){
                        i++;
                    }
                }
            }
            count++;
        }
        System.out.println(count);
    }
}