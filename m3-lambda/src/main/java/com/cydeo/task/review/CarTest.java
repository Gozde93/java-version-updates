package com.cydeo.task.review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {

    public static void main(String[] args) {

        Car2 car2 = new Car2();
        //Car2 car22 = new Car2("Toyota");

        Car2 car2FromBuilder = Car2.builder().make("Toyota").topSpeed(150).year(2020).build();
        Car2 car2FromBuilder2 = Car2.builder().build();
        Car2 car2FromBuilder3 = Car2.builder().build();


        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

        carList.forEach(car -> System.out.println(car));

        System.out.println("Fast Cars - Traditional:");
        System.out.println(filterFastCars(carList));

        System.out.println("New Cars - Traditional:");
        System.out.println(filterNewCars(carList));

        System.out.println("Fast Cars - Behavior Parameterization:");
        CarPredicate carFastPredicate = new CarFastPredicate();
        System.out.println(filter(carList, carFastPredicate));

        System.out.println("New Cars - Behavior Parameterization:");
        System.out.println(filter(carList, new CarNewPredicate()));

        System.out.println("Fast Cars - Lambda:");
        CarPredicate carPredicate = (Car car) -> { return car.getTopSpeed() > 160; };
        System.out.println(filter(carList, carPredicate));

//        System.out.println(filter(carList, (Car car) -> { return car.getTopSpeed() > 160; };));

        System.out.println("New Cars - Lambda:");
        System.out.println(filter(carList, car -> car.getYear() > 2015));

        System.out.println("Fast Cars - Lambda - Functional Interface Usage:");
        Predicate<Car> carPredicate2 = (Car car) -> { return car.getTopSpeed() > 160; };
        System.out.println(filter2(carList, carPredicate2));

        System.out.println("New Cars - Lambda - Functional Interface Usage:");
        System.out.println(filter2(carList, car -> car.getYear() > 2015));







        // ok dan sonraki lambda is implementation of the car predicate interface, that is why we dont need to write (Car car), if we only have one parameter we can move the parantesis, if we do not have any parameters we should do thiss empty parantesis(),

    }

    private static List<Car> filterFastCars(List<Car> carList) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car eachCar : carList) {
            if (eachCar.getTopSpeed() > 160) {
                filteredCars.add(eachCar);
            }
        }

        return filteredCars;

    }

    private static List<Car> filterNewCars(List<Car> carList) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car eachCar : carList) {
            if (eachCar.getYear() > 2015) {
                filteredCars.add(eachCar);
            }
        }

        return filteredCars;

    }

    private static List<Car> filter(List<Car> carList, CarPredicate carPredicate) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car eachCar : carList) {
            if (carPredicate.test(eachCar)) {
                filteredCars.add(eachCar);
            }
        }

        return filteredCars;

    }

    private static List<Car> filter2(List<Car> carList, Predicate<Car> carPredicate) {

        List<Car> filteredCars = new ArrayList<>();

        for (Car eachCar : carList) {
            if (carPredicate.test(eachCar)) {
                filteredCars.add(eachCar);
            }
        }

        return filteredCars;

    }


}
