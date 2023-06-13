/**
 * 
 */
package com.alonso.hackerrank.FlippingTheMatrix;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/**
 * @author Jalonso98
 *
 */
class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
//        for (int i = 0; i < matrix.size()/2; i++) {
//            int down = matrix.get(i).get(2);
//            int up = matrix.get((matrix.size()-i)-1).get(2);
//            matrix.get(i).set(2, up);
//            matrix.get((matrix.size()-i)-1).set(2, down);
//        }
//        
//        for (int i = 0; i < matrix.size()/2; i++) {
//            int right = matrix.get(0).get(i);
//            int left = matrix.get(0).get((matrix.size()-i)-1);
//            matrix.get(0).set(i, left);
//            matrix.get(0).set((matrix.size()-i)-1, right);
//        }
//        
//        return matrix.get(0).get(0) + matrix.get(0).get(1) +matrix.get(1).get(0) + matrix.get(1).get(1);
    	int sum = 0;
        int size = matrix.size();
        for (int i = 0; i < size/2; i++) {
            for (int j = 0; j < size/2; j++) {
                sum += Math.max( matrix.get(i).get(j), 
                    Math.max( matrix.get(i).get(size-1-j),
                    Math.max( matrix.get(size-1-i).get(j), 
                        matrix.get(size-1-i).get(size-1-j))
                    )  
                );
            }            
        }
        return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> matrix = new ArrayList<>();

                IntStream.range(0, 2 * n).forEach(i -> {
                    try {
                        matrix.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                        );
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int result = Result.flippingMatrix(matrix);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}