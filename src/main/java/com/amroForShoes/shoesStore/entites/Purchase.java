package com.amroForShoes.shoesStore.entites;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;

    @Column(name = "shoes_id", nullable = false)
    private Long shoesId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shoes_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Shoes shoes;



//    @Column(name = "image_source", nullable = false)
//    private String imageSrc;

    @Column(name = "price", nullable = false)
    private Double price;

//    @Column(name = "purchase_time", nullable = false)
//    private LocalDateTime purchaseTime;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shoes")
//    private Set<Purchase> purchaseList;
}
