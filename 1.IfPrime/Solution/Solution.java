/**
 * Solution
 */
import java.util.*;
public class Solution {



    
    public static void main(String[] args) {
        try (// YOUR CODE GOES HERE
                // Please take input and print output to standard input/output (stdin/stdout)
                // DO NOT USE ARGUMENTS FOR INPUTS
                // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scannerObject = new Scanner(System.in)) {
            String inputString = scannerObject.nextLine();
            int inputInt = Integer.parseInt(inputString);
            for (int i = 2; i < Math.sqrt(inputInt) ; i++) {
                if (inputInt % i == 0) {
                    System.out.println("NO");
                    return;
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("YES");
        return;
    }
}
