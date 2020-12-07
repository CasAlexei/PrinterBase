package ITKot;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson21 {
    public static void main(String[] args) {


        List<Integer> listInt = new ArrayList<Integer>();
        List<String> listStr = new ArrayList<String>();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();


        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        map.put(4,40);
        map.put(5,50);
        map.put(6,50);
        map.put(3,50);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
        System.out.println(map.get(5));
        System.out.println(map.get(8));

        System.out.println(factorial(100));
        System.out.println(factorialArray(100));


    }

    static Map<Integer,BigInteger> cash = new HashMap<Integer, BigInteger>();

    public static BigInteger factorial(int n){
        if (n==1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static BigInteger factorialArray(int n){
        BigInteger rezult;

        if(n==1) return BigInteger.ONE;
        if((rezult = cash.get(n)) != null) return rezult;
        rezult =  BigInteger.valueOf(n).multiply(factorialArray(n-1));
        cash.put(n,rezult);
        return rezult;

    }
}
