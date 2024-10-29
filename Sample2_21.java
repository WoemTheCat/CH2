import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Sample2_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數");
        Integer test[] = new Integer[5];

        for (int i = 0; i < 5; i++)
            test[i] = Integer.parseInt(br.readLine());

        Arrays.sort(test, Collections.reverseOrder());

        for (int i = 0; i < 5; i++)
            System.out.println("第" + (i + 1) + "個人的分數是" + test[i] + "分");
    }
}
