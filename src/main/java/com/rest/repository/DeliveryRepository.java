package com.rest.repository;

import com.rest.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
    //Derived query
    Delivery findByPartnerName(String partnerName);

}
