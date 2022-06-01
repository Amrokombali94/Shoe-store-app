package com.amroForShoes.shoesStore.service;

import com.amroForShoes.shoesStore.entites.Purchase;
import com.amroForShoes.shoesStore.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemOfUser(Long userId);
}
