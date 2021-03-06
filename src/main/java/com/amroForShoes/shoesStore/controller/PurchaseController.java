package com.amroForShoes.shoesStore.controller;

import com.amroForShoes.shoesStore.entites.Purchase;
import com.amroForShoes.shoesStore.security.UserPrinciple;
import com.amroForShoes.shoesStore.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purchase")
public class PurchaseController
{
    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity<?> savePurchase(@RequestBody Purchase purchase)
    {
        return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAllPurchaseOfUser(@AuthenticationPrincipal UserPrinciple userPrinciple){
        return ResponseEntity.ok(purchaseService.findPurchaseItemOfUser(userPrinciple.getId()));
    }
}
