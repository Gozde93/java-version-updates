package com.cydeo.task;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //Print all emails

        EmployeeData.readAll()
                .map(Employee::getEmpName)
                .forEach(System.out::println);


        System.out.println("Print all phone numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out :: println);

        System.out.println("Print all phone numbers with double Colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);



    }
}
