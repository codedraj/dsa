
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Solution
 */
public class Solution {
    public static ArrayList<Integer> returnFactors (int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                int coFactor = num / i;
                if (coFactor > i) {
                    arr.add(i);
                    arr.add(coFactor);
                } else if (coFactor == i) {
                    arr.add(i);
                }  
                else {
                    break;
                }
            }
        }
        arr.add(1);
        return arr;
    }
   public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int inputString = scannerObject.nextInt();
        ArrayList<Integer> factorsArray = returnFactors(inputString);
        System.out.println(factorsArray);
        int sum = 0;
        for (int i = 0; i < factorsArray.size(); i++) {
            sum += factorsArray.get(i);
        }
        if (inputString == sum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scannerObject.close();
    }
}