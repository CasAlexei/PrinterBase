package ITKot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = 0;
        int n = 0;
        System.out.println("введите количество строк");
        String data = reader.readLine();
        m = Integer.parseInt(data);
        System.out.println("введите количество символов в строке");
        data = reader.readLine();
        n = Integer.parseInt(data);

        System.out.println(m + " строк по " + n + " символов");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
        System.out.println("Введите числа. Для выхода введите \"-1\"");
        int sum = 0;
        do{
            data = reader.readLine();
            sum += Integer.parseInt(data);
        }while(!(data.equals("-1")));
        System.out.println("   сумма чисел = " + sum);
    }
}
