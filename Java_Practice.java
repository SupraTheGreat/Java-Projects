package ClassesJava;

import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Java_Practice {
    public static int listSum(ArrayList<Integer> arr1){
        int sum = 0;
        for (int i = 0; i < arr1.size(); i++){
            sum += arr1.get(i);
        }
        return sum;
    }

    public static int factorial(int n){
        int res = 1;
        for (int i = n; i > 0; i--){
            res *= i;
        }
        return res;
    }

    public static double pyth(int a, int b){
        double c = (Math.pow(a, 2) + (Math.pow(b, 2)));
        c = Math.sqrt(c);
        return c;
    }

    public static boolean palindrome(String word){
        StringBuilder input1 = new StringBuilder();
        input1.append(word);
        input1.reverse();
        String reversed = input1.toString();
        return reversed.equals(word);
    }

    public static ArrayList rangeValues(ArrayList<Integer> rangeList){
        for (int i = 0; i < 100; i++){
            rangeList.add(i);
        }
        return rangeList;
    }

    public static void fizzBuzz(ArrayList<Integer> fizzList){
        for (int i = 1; i < fizzList.size()+1; i++){
            if (i%3 == 0){
                if (i%5 == 0){
                    System.out.println(i + ": FizzBuzz");
                } else {
                    System.out.println(i + ": Fizz");
                }
            } else if (i%5 == 0){
                System.out.println(i + ": Buzz");
            }
        }
    }

    public static void findPrime(int pn){
        for (int x = 1; x < pn/2; x++){
            if ((pn%x != 0 && pn != 1 && x != 1) || x == 2){
                ;
            } else {
                System.out.println(pn + " is not a prime number.");
                return;
            }
        }
        System.out.println(pn + " is a prime number.");
    }

    public static double calculate(double n1, double n2, char op){
        if (op == '*'){
            return n1 * n2;
        } else if (op == '+'){
            return n1 + n2;
        } else if (op == '/'){
            return n1 / n2;
        } else {
            return n1 - n2;
        }
    }

    public static String convertTime(String time24) {
        String stime12 = "";
        String time12 = null;
        for (int i = 0; i < time24.length(); i++) {
            if (time24.charAt(i) == ':') {
                stime12 = time24.substring(0, i);
                int intime12 = Integer.parseInt(stime12);
                if (intime12 > 12) {
                    intime12 -= 12;
                    time12 = Integer.toString(intime12);
                    time12 = time12.concat(":");
                    time12 = time12.concat(time24.substring(i + 1, i + 3));
                    time12 = time12.concat(" PM");
                } else {
                    return time24.concat(" AM");
                }
            }
            stime12 = stime12.concat(String.valueOf(time24.charAt(i)));
        }
        return time12;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sum of all elements in an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4, 5, 4, 5, 6));
        for (int i = 0; i < list.size(); i++){
            if (i == list.size()-1){
                System.out.print(list.get(i) + " = ");
            } else {
                System.out.print(list.get(i) + " + ");
            }
        }
        System.out.print(listSum(list) + "\n");

        // Factorial
        System.out.print("\nEnter a number: ");
        String nu = scanner.nextLine();
        int num = Integer.parseInt(nu);
        System.out.println("The factorial of " + num + " is " + factorial(num));

        // Pythagorean Theorem
        System.out.println("\nEnter 2 leg lengths of a right triangle.");
        System.out.print("Leg length #1: ");
        String one = scanner.nextLine();
        System.out.print("Leg length #2: ");
        String two = scanner.nextLine();
        int x = Integer.parseInt(one);
        int y = Integer.parseInt(two);
        System.out.println("The length of the Hypotenuse of the right triangle is " + pyth(x, y));

        // Palindrome Check
        System.out.print("\nEnter a word: ");
        String w = scanner.nextLine();
        if (palindrome(w)){
            System.out.println("The word " + w + " is a palindrome.");
        } else {
            System.out.println("The word " + w + " is not a palindrome.");
        }

        // FizzBuzz
        ArrayList<Integer> lst2 = new ArrayList<Integer>();
        lst2 = rangeValues(lst2);
        fizzBuzz(lst2);

        // Prime Number Checker
        System.out.println("Enter a number: ");
        String stringn = scanner.nextLine();
        int primenum = Integer.parseInt(stringn);
        findPrime(primenum);

        // Two-Number Calculator
        System.out.println("Enter a number: ");
        String numb1 = scanner.nextLine();
        double n1 = Double.parseDouble(numb1);

        System.out.println("Enter an operator: ");
        String op1 = scanner.nextLine();
        char o = op1.charAt(0);

        System.out.println("Enter the second number: ");
        String numb2 = scanner.nextLine();
        double n2 = Double.parseDouble(numb2);

        if (o != '*' && o != '+' && o != '/' && o != '-'){
            System.out.println("You did not enter a valid operator. Rerun the project.");
        } else {
            System.out.println("The answer is " + calculate(n1, n2, o));
        }

        // 24 Hour to 12 Hour Time
        System.out.println("Enter a time in 24-hour format: ");
        String tim24 = scanner.next();
        System.out.println("The time in 12-hour format is " + convertTime(tim24));
    }
}
