import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        int count = 0;

        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += list[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}