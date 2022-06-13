package com.amroForShoes.shoesStore.repository;

import com.amroForShoes.shoesStore.entites.Purchase;
import com.amroForShoes.shoesStore.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {


//    @Query("SELECT "+
//            "sh.shoesName as name, pur.price as price, pur.purchaseTime as purchaseTime "+
//            "from Purchase pur LEFT JOIN Shoes sh ON sh.id = pur.shoesId " +
//            "where pur.userId = :userId")

    @Query("SELECT "+
            "sh.shoesName as name, pur.price as price  "+
            "from Purchase pur LEFT JOIN Shoes sh ON sh.id = pur.shoesId " +
            "where pur.userId = :userId")

    List<PurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);
}
