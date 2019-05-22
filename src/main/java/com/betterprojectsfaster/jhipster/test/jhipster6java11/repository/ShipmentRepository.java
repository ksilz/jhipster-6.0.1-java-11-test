package com.betterprojectsfaster.jhipster.test.jhipster6java11.repository;

import com.betterprojectsfaster.jhipster.test.jhipster6java11.domain.Shipment;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the Shipment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    @Query("select shipment from Shipment shipment where shipment.shippedBy.login = ?#{principal.username}")
    List<Shipment> findByShippedByIsCurrentUser();

}
