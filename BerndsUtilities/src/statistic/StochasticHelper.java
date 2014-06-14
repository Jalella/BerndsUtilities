/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package statistic;

import java.util.Random;

/**
 *
 * @author Bernd
 */
public class StochasticHelper {
    public static int[] DrawNOutOfMWithoutPuttingBack(int N, int M){
        int[] returnArray = new int[N];
        int[] values = new int[M];
        Random r = new Random();
        int randy;
        int tmp;
        
        // initialising array
        for (int i=0; i<M; values[i]=i++);
        
        for (int i=0; i<N; i++) {
            // ziehe zufallszahl randy aus [0..M-i-1]
            randy = r.nextInt(M-i);
            returnArray[i] = values[randy];
            // the conjuring trick: put last at this place an vice versa
            tmp = values[randy];
            values[randy] = values[M-i-1];
            values[M-i-1] = tmp;
        }
        return returnArray;
    }
    
    public static void main(String[] args){
        int result[] = DrawNOutOfMWithoutPuttingBack(10, 10);
        for (int i=0; i<10; i++ ) {
            System.out.println(result[i]);
        }
    }
}
