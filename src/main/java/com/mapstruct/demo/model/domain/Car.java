package com.mapstruct.demo.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Car {

    private String brand;

    private int numberOfSeats;

    private Double price;

}


