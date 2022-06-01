package com.amroForShoes.shoesStore.service;

import com.amroForShoes.shoesStore.entites.Purchase;
import com.amroForShoes.shoesStore.repository.PurchaseRepository;
import com.amroForShoes.shoesStore.repository.projection.PurchaseItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class purchaseServiceImp implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase savePurchase(Purchase purchase){
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemOfUser(Long userId){

        return purchaseRepository.findAllPurchaseOfUser(userId);
    }


}
