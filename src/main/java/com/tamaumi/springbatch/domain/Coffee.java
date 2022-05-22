package com.tamaumi.springbatch.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "coffee")
@NoArgsConstructor
@AllArgsConstructor
public class Coffee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coffee_Id")
    private Integer coffeeId;

    @Column(length = 20)
    private String brand;

    @Column(length = 20)
    private String origin;

    @Column(length = 30)
    private String characteristics;

    public Coffee(String brand, String origin, String characteristics) {
        this.brand = brand;
        this.origin = origin;
        this.characteristics = characteristics;
    }
}
