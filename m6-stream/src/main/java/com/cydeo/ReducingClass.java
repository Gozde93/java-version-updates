package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducingClass {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }

        int result = numbers.stream().reduce(0,(a,b) -> a + b);
        System.out.println(result);

        Optional<Integer> result2 = numbers.stream().reduce((a,b) -> a + b);
        System.out.println(result2.get());


        System.out.println("Dish calories total: ");
        DishData.getAll().stream()
                .map(Dish::getCalories)
                //.reduce((a,b) -> a + b)
                .reduce(Integer::sum)
                .get();

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum2 = " + sum2);



        //COUNT
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);






    }


}
