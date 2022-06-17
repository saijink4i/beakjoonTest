import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
    Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용함.
    BufferedWriter.flush는 맨 마지막에 한 번만 하면 됨.
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));    // BufferedReader 선언
        int testcase=0;
        String result="";
        String text;
        int[] num = new int[2];
        
        testcase = Integer.parseInt(bf.readLine()); //몇 회 덧셈을 할건지 입력받음
        
        
        for(int i=0 ; i<testcase ; i++) {
            text = bf.readLine();
            num[0] = Integer.parseInt(text.substring(0,text.lastIndexOf(" ")));
            num[1] = Integer.parseInt(text.substring(text.lastIndexOf(" ")+1));
            result += (num[0] + num[1]) + "\n";
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   // BufferedWriter 선언
        bw.write(result);   // 결과값 출력
        bw.flush();
    }
}