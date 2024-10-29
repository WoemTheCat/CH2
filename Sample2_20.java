import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數");
        int test[] = new int[5];

        for (int i = 0; i < 5; i++)
            test[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < test.length - 1; i++) {
            for (int j = i + 1; j < test.length; j++) {
                if (test[j] > test[i]) {
                    int tmp = test[j];
                    test[j] = test[i];
                    test[i] = tmp;
                }
            }
        }

        for (int i = 0; i < 5; i++)
            System.out.println("第" + (i + 1) + "個人的分數是" + test[i] + "分");
    }
}
