/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.statistics;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ABDELHALIM
 */
public class Statistics {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine().trim());
        String[] lineValues = scanner.nextLine().split(" ");
        double[] results = new double[3];
        int[] numbers = convertStringIntoInteger(size, lineValues);
        sortArray(numbers);
        results[0] = new Mean().getResult(size, numbers);
        results[1] = new Median().getResult(size, numbers);
        results[2] = new Mode().getResult(size, numbers);
        printResults(results);
    }
    
    private static int[] convertStringIntoInteger(int size, String[] array) {
        int[] temp = new int[size];
        for (int i = 0; i < size; i++) {
            temp[i] = Integer.parseInt(array[i]);
        }
        return temp;
    }
    
    private static void printResults(double[] results){
        DecimalFormat formatter = new DecimalFormat(".#");
        for(double result : results){
            System.out.println(formatter.format(result));
        }
    }
    
    private static void sortArray(int[] values){
        int temp=0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                if(values[i] < values[j]){
                   temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
    }
}
