import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;
        for(int i=0 ; i<text.length() ; i++){
            if(i<(text.length()-2)){  //dz=�� ��ĭ�� ������ �־����
                if(text.charAt(i)=='d'){
                    if((text.charAt(i+1)=='z')&&(text.charAt(i+2)=='=')){
                        i+=2;
                    }
                }
            }
            if(i<(text.length()-1)){    //�������� ��ĭ�� ������ �־����
                if(text.charAt(i)=='c'){    //c�ϰ��
                    if(text.charAt(i+1)=='='){
                        i++;
                    }else if(text.charAt(i+1)=='-'){
                        i++;
                    }
                }else if(text.charAt(i)=='d'){  //d�ϰ��
                    if(text.charAt(i+1)=='-'){
                        i++;
                    }
                }else if(text.charAt(i)=='l'){  //l�ϰ��
                    if(text.charAt(i+1)=='j'){
                        i++;
                    }
                }else if(text.charAt(i)=='n'){  //n�ϰ��
                    if(text.charAt(i+1)=='j'){
                        i++;
                    }
                }else if(text.charAt(i)=='s'){  //s�ϰ��
                    if(text.charAt(i+1)=='='){
                        i++;
                    }
                }else if(text.charAt(i)=='z'){  //z�ϰ��
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