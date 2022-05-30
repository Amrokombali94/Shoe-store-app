package com.amroForShoes.shoesStore.repository;

import com.amroForShoes.shoesStore.entites.Shoes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoesRepository extends JpaRepository<Shoes, Long> {
}
