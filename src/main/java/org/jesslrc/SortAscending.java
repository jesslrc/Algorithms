package org.jesslrc;

import java.util.ArrayList;
import java.util.List;

public class SortAscending {
    public static List<Integer> sortAscending(List<Integer> list) {

        List<Integer> input = new ArrayList<>(list);
        List<Integer> orderedList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int j = 0; j < input.size(); j++) {
                int current = input.get(j);

                if(current < min) {
                    min = current;
                    minIndex = j;
                }
            }
            orderedList.add(min);
            input.remove(minIndex);
        }

        return orderedList;
    }

    public static void main(String[] args) {

        List<Integer> input = List.of(9, 12, 1, 4, 3); // Expected is ?

        List<Integer> result = sortAscending(input);

        result.forEach(System.out::println);
    }
}
