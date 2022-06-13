package com.amroForShoes.shoesStore.controller;

import com.amroForShoes.shoesStore.entites.Shoes;
import com.amroForShoes.shoesStore.service.ShoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/shoes")
public class ShoesController
{
    @Autowired
    private ShoesService shoesService;

    @PostMapping
    public ResponseEntity<?> saveShoes(@RequestBody Shoes shoes){

        return new ResponseEntity<>(shoesService.saveShoes(shoes), HttpStatus.CREATED);
    }

    @DeleteMapping("{shoesId}")
    public ResponseEntity<?> deleteShoes(@PathVariable Long shoesId)
    {
        shoesService.deleteShoesById(shoesId);

        return new ResponseEntity<>((HttpStatus.OK));
    }

    @GetMapping
    public  ResponseEntity<?> getAllShoes(){
        return new ResponseEntity<>(shoesService.findAllShoes(), HttpStatus.OK);
    }

}
