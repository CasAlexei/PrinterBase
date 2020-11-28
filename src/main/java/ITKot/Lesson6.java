package ITKot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String slovo = reader.readLine();
        String slovo1 = reader.readLine();
        String slovo2 = reader.readLine();

        System.out.println(slovo + " будет получать " + slovo1 + " через " + slovo2 + " лет");
    }
}
