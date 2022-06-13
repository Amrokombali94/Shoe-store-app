package com.amroForShoes.shoesStore.service;


import com.amroForShoes.shoesStore.entites.Shoes;
import com.amroForShoes.shoesStore.repository.ShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoesServiceImpl implements ShoesService {

    @Autowired
    private ShoesRepository shoesRepository;

    @Override
    public Shoes saveShoes(Shoes shoes){

        return shoesRepository.save(shoes);
    }

    @Override
    public void deleteShoesById(Long id){

         shoesRepository.deleteById(id);
    }

    @Override
    public List<Shoes>  findAllShoes(){

        return shoesRepository.findAll();
    }
}
