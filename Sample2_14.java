import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_14 {
    public static void main(String[] args) throws IOException {
        System.out.println("要跳過第幾次的處理呢?(1~10)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 10; i++) {
            if (i == num)
                continue;
            System.out.println("第" + i + "次的處理。");
        }
    }
}
