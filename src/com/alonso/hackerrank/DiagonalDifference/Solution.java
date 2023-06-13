/**
 * 
 */
package com.alonso.hackerrank.DiagonalDifference;

/**
 * @author Jalonso98
 *
 */
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
        
        int leftRight = 0, rightLeft = 0;
        int limit = arr.size() - 1;
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
            	if(i != j) {
                	continue;
                }
                leftRight += arr.get(i).get(j);
                rightLeft += arr.get(i).get(limit - j);
            }
        }
        
        return Math.abs(leftRight - rightLeft);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of the matrix:");
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        System.out.println(result);
        
        bufferedReader.close();
    }
}
