package com.cydeo.task.review;

import lombok.Setter;

@Setter

public class Car2 {

    private String make;
    private int topSpeed;
    private int year;

    public Car2(String make, int topSpeed){
        this.make = make;
        this.topSpeed = topSpeed;
    }

    public Car2(){

    }




    public static Car2Builder builder(){
        return new Car2Builder();




    }


    public static class Car2Builder {
        private String make;
        private int topSpeed;
        private int year;

        public Car2Builder() {

        }

        public Car2Builder make(String make) {
            this.make = make;
            return this;
        }

        public Car2Builder topSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
            return this;
        }

        public Car2Builder year(int year) {
            this.year = year;
            return this;
        }

        public Car2 build() {
            Car2 car2 = new Car2();
            if (this.make != null) {
                car2.setMake(this.make);
            }

            if (this.topSpeed != 0) {
                car2.setTopSpeed(this.topSpeed);
            }

            if (this.year != 0) {
                car2.setYear(this.year);
            }
            return car2;
        }

    }}
//Car2Builder car2Builder = new Car2Builder();
//car2Builder.make("BMW").topSpeed(50).year(2020);