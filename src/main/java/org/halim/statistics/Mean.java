/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.statistics;

/**
 *
 * @author ABDELHALIM
 */
public class Mean implements Operation {

    @Override
    public double getResult(int size, int[] numbers) {
        double summation = 0.0;
        for (int i = 0; i < size; i++) {
            summation += numbers[i];
        }
        return summation / size;
    }

}
