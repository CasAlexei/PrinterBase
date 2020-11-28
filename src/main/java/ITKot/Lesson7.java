package ITKot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите два числа");

        String data = reader.readLine();
        int data1 = Integer.parseInt(data);
        data = reader.readLine();
        int data2 = Integer.parseInt(data);

        if(data1 > data2){
            System.out.println("   " + data1 + " больше чем " + data2);
        }
        else{
            System.out.println("   " + data2 + " больше чем " + data1);
        }
        System.out.println("введите три числа");
        data = reader.readLine();
        data1 = Integer.parseInt(data);
        data = reader.readLine();
        data2 = Integer.parseInt(data);
        data = reader.readLine();
        int data3 = Integer.parseInt(data);
        int min = data1;
        if(data2 < min){
            min = data2;
        }
        if(data3 < min){
            min = data3;
        }
        System.out.println("    минимальное число = " + min);
    }
}
