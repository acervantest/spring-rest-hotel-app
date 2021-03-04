package com.rest.repository;

import com.rest.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

    //Derived query
    List<Menu> findByHotelHotelName(String hotelName);

    //JPQL query
    @Query("FROM Menu m INNER JOIN m.hotel h WHERE h.hotelName =?1")
    List<Menu> findByHotel(String hotelName);

    //SQL native query
    @Query(value = "select * from menu m inner join hotel h on m.hotel_id=h.hotel_id where h.hotel_name=?1", nativeQuery = true)
    List<Menu> findByHotelNative(String hotelName);

}
