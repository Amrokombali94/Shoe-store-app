package com.amroForShoes.shoesStore.service;


import com.amroForShoes.shoesStore.repository.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class shoesServiceImp implements shoesService {

    @Autowired
    private ShoesRepository shoesRepository;
}
