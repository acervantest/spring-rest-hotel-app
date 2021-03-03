package com.rest.repository;

import com.rest.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    List<Hotel> findByAddressCity(String city);
    List<Hotel> findByAddressStreetName(String location);
}
