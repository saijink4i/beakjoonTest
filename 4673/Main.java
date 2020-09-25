public class Main {
    public static void main(String[] args) {
        final int testcase = 10000;
        int num[] = new int[testcase+40];
        for(int i=0; i<num.length ; i++)
            num[i]=i+1;

        for(int i=1 ; i<=testcase ; i++){
            int temp=i,result=i;
            while (temp>0) {
                result+=temp%10;
                temp/=10;
            }
            for(int j=0; j<num.length ; j++){
                if(result==num[j]){
                    num[j]=0;
                    break;
                }
            }
        }
        for(int i=0 ; i<testcase ; i++){
            if(num[i]!=0)
                System.out.println(num[i]);
        }
    }
}