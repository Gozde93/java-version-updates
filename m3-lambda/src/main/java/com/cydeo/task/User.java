package com.cydeo.task;

import lombok.*;

//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor // constructor da parametre yok. bos. default constructor gibi
@Data
@AllArgsConstructor // constructor de tum parametreler var demek oluyo

public class User {

    private String firstName;
    private String lastName;
    private int age;
}
