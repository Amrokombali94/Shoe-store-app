package com.amroForShoes.shoesStore.service;

import com.amroForShoes.shoesStore.entites.Shoes;

import java.util.List;

public interface ShoesService {
    Shoes saveShoes(Shoes shoes);

    void deleteShoesById(Long id);

    List<Shoes> findAllShoes();
}
