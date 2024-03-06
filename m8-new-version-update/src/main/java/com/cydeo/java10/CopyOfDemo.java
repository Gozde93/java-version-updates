package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2,4,6,8);

        List<Integer> unmodifiableList1 = List.of(2,4,6,8);
        List<Integer> unmodifiableList2 = List.copyOf(numberList);







    }
}
