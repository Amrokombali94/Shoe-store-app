package com.amroForShoes.shoesStore.entites;



import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username" , unique = true, nullable = false, length = 100)
    private String username;


    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;


    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;
}