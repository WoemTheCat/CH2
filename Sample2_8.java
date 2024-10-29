import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_8 {
    public static void main(String[] args) throws IOException {
        System.out.println("請問要選哪條路線?");
        System.out.println("請輸入整數");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        char ans = (num == 1) ? 'A' : 'B';

        System.out.println("選擇了" + ans + "路線");
    }
}
