package com.cydeo.review;

public enum RoleEnum {

    ADMIN("ADMIN1","Admin2"), MANAGER("MANAGER1","Manager2"), EMPLOYEE("Employee1","Employee2");


    public String value1;
    public String value2;


    private RoleEnum(String value1,String value2){
        this.value1 = value1;
        this.value2 = value2;
    }
}
