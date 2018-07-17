/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.statistics;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ABDELHALIM
 */
public class Mode implements Operation {

    @Override
    public double getResult(int size, int[] numbers) {
        HashMap<Integer, Integer> mapper = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (mapper.containsKey(numbers[i])) {
                //increment counter
                mapper.put(numbers[i], (mapper.get(numbers[i]) + 1));
            } else {
                mapper.put(numbers[i], 1);
            }
        }
        List<Integer> keys = getListOfModes(mapper);
        return Collections.min(keys);
    }

    private static List<Integer> getListOfModes(HashMap<Integer, Integer> mapper) {
        if (mapper.isEmpty()) {
            return Collections.emptyList();
        }
        long max = mapper.values().stream().max(Comparator.naturalOrder()).get();
        return mapper.entrySet().stream()
                .filter(e -> e.getValue() == max)
                .map(HashMap.Entry::getKey)
                .collect(Collectors.toList());
    }

}
