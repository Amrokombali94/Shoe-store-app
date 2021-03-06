package com.amroForShoes.shoesStore.entites;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "shoes")
@SequenceGenerator(name = "Shoes_sequence", initialValue = 17)
public class Shoes {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Shoes_sequence")
    private Long id;

    @Column(name = "shoes_name", nullable = false)
    private String shoesName;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "image_source", nullable = false)
    private String imageSrc;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "price", nullable = false)
    private double price;


}