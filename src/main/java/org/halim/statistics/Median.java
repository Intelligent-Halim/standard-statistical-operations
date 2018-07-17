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
public class Median implements Operation {

    @Override
    public double getResult(int size, int[] numbers) {

        if (size % 2 == 0) {
            //even
            return (numbers[size / 2 - 1] + numbers[size / 2]) / 2.0;
        } else {
            //odd
            return (numbers[size / 2 - 1]);
        }
    }

}
