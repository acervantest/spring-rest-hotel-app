package com.rest.repository;

import com.rest.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    //Derived query
    List<Hotel> findByAddressCity(String city);
    //Derived query
    List<Hotel> findByAddressStreetName(String location);

    @Query("FROM Hotel h INNER JOIN h.menuList mn WHERE mn.menuName=?1")
    List<Hotel> getHotelsByMenu(String menuName);

    @Query("FROM Hotel h INNER JOIN h.delivery d WHERE d.partnerName=?1")
    List<Hotel> getHotelsByDelivery(String partnerName);

    @Query("FROM Hotel h INNER JOIN h.address a INNER JOIN h.menuList mn WHERE a.streetName=?1 AND mn.menuName=?2")
    List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);
}
