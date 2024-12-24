package ClassesJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wordle{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Creating a scanner

        System.out.println("How many numbers of the Fibonacci Sequence should I print? ");
        String num = scanner.nextLine();
        int n = Integer.parseInt(num);

        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(1);
        int sum = 0;
        System.out.println(0);
        System.out.println(1);
        System.out.println(1);

        for(int i = 2; i <= (n-1); i++){
            sum = arr.get(i) + arr.get(i-1);
            arr.add(sum);
            System.out.println(sum);
        }

    }
}