package com.lessons.spring.basics.componentAndAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    //Sort an array
    //Search the array
    //Return result

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        //Sorting logic
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        //Search the array

        return 3;
    }
}
