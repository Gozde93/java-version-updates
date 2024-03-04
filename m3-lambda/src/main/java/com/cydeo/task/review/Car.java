package com.cydeo.task.review;

import lombok.*;
import lombok.ToString;
import lombok.ToString;

@AllArgsConstructor(access = AccessLevel.PROTECTED) // protect edebiliriz boyle
//@NoArgsConstructor
//@RequiredArgsConstructor // If I have final I can use this constructor
//@Getter
//@Setter()
//@ToString(exclude = "topSpeed") // boyle yaparsak to stringde topSpeed i eklememis oluruz
//@EqualsAndHashCode
@Data

public class Car {

  private String make;
  private  int topSpeed;
  private final int year;


}
