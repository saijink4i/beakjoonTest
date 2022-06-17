import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
    Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용함.
    BufferedWriter.flush는 맨 마지막에 한 번만 하면 됨.
*/
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    // BufferedReader 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine()); //몇 회 덧셈을 할건지 입력받음
        
        StringTokenizer st;
        for(int i=0 ; i<testcase ;i++){
            //String[] temp = br.readLine().split(" ");
            //bw.write((Integer.parseInt(temp[0]) + Integer.parseInt(temp[1])) + "\n");

            st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }

        br.close();
           // 결과값 출력
        bw.flush();
        bw.close();
    }
}