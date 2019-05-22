package com.betterprojectsfaster.jhipster.test.jhipster6java11.repository;

import com.betterprojectsfaster.jhipster.test.jhipster6java11.domain.ProductOrder;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the ProductOrder entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {

    @Query("select productOrder from ProductOrder productOrder where productOrder.buyer.login = ?#{principal.username}")
    List<ProductOrder> findByBuyerIsCurrentUser();

}
