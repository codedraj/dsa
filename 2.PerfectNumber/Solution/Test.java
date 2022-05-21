import java.lang.*;
import java.util.*;

public class Test {

        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        public static void main (String[] args) {
            Scanner scannerObject = new Scanner(System.in);
            Integer[] inputArray = new Integer[10];
            for (int i = 0; i < 10; i++) {
                String inputString = scannerObject.nextLine();
                int inputNum = Integer.parseInt(inputString);
                inputArray[i] = inputNum;
            }
            scannerObject.close();
           for (int j = 0; j  < inputArray.length; j++) {
            int num = inputArray[j];
            ArrayList<Integer> factorsArray = new ArrayList<>();
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    int coFactor = num / i;
                    if (coFactor > i) {
                        factorsArray.add(i);
                        factorsArray.add(coFactor);
                    } else if (coFactor == i) {
                        factorsArray.add(i);
                    } else {
                        break;
                    }
                }
            }
            factorsArray.add(1);
            int sum = 0;
            for (int i = 0; i < factorsArray.size(); i++ ) {
                sum = sum + factorsArray.get(i);
            }
            if (sum == num) {
                System.out.println("YES, " + num + " is perfect");
            } else {
                System.out.println("NO, " + num + " is not");
            }
           }
        }
}