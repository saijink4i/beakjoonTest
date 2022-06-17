import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
    Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� �����.
    BufferedWriter.flush�� �� �������� �� ���� �ϸ� ��.
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));    // BufferedReader ����
        int testcase=0;
        String result="";
        String text;
        int[] num = new int[2];
        
        testcase = Integer.parseInt(bf.readLine()); //�� ȸ ������ �Ұ��� �Է¹���
        
        
        for(int i=0 ; i<testcase ; i++) {
            text = bf.readLine();
            num[0] = Integer.parseInt(text.substring(0,text.lastIndexOf(" ")));
            num[1] = Integer.parseInt(text.substring(text.lastIndexOf(" ")+1));
            result += (num[0] + num[1]) + "\n";
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   // BufferedWriter ����
        bw.write(result);   // ����� ���
        bw.flush();
    }
}