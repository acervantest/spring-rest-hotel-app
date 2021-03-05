package com.rest.controllers;

import com.rest.models.Hotel;
import com.rest.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels-restapi")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @GetMapping("/hotels/hotel-by-id/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable int hotelId){
        Hotel hotel = hotelService.getHotelById(hotelId);
        HttpHeaders headers =  new HttpHeaders();
        headers.add("desc", "getting one hotel instance");
        return ResponseEntity.ok().headers(headers).body(hotel);
    }

    @GetMapping("/hotels/hotels-by-city/{cityName}")
    public ResponseEntity<List<Hotel>> getHotelsByCity(@PathVariable("cityName") String city){//path-var is used when arg name is different
        List<Hotel> hotelsList = hotelService.getHotelsByCity(city);
        return ResponseEntity.ok(hotelsList);
    }

    @GetMapping("/hotels/hotels-by-menu/{menuName}")
    public ResponseEntity<List<Hotel>> getHotelsByMenu(@PathVariable String menuName){
        List<Hotel> hotelList = hotelService.getHotelsByMenu(menuName);
        return ResponseEntity.ok().body(hotelList);
    }

    @GetMapping("/hotels/hotels-by-delivery/{partnerName}")
    public ResponseEntity<List<Hotel>> getHotelsByDelivery(@PathVariable String partnerName){
        List<Hotel> hotelList = hotelService.getHotelsByDelivery(partnerName);
        return ResponseEntity.ok().body(hotelList);
    }

    @GetMapping("/hotels/hotels-by-location/{location}")
    public ResponseEntity<List<Hotel>> getHotelsByLocation(@PathVariable String location){
        List<Hotel> hotelList = hotelService.getHotelsByLocation(location);
        return ResponseEntity.ok().body(hotelList);
    }

    @GetMapping("/hotels/hotels-by-location/{location}/menuName/{menuName}")
    public ResponseEntity<List<Hotel>> getHotelsByLocationAndMenu(@PathVariable String location, @PathVariable String menuName){
         List<Hotel> hotelList = hotelService.getHotelsByLocationAndMenu(location, menuName);
         return ResponseEntity.ok().body(hotelList);
    }

    @PostMapping("/hotels")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        Hotel newHotel = hotelService.addHotel(hotel);
        HttpHeaders headers =  new HttpHeaders();
        headers.add("desc", "one hotel added");
        return ResponseEntity.ok().headers(headers).body(newHotel);
    }

    @PutMapping("/hotels")
    public ResponseEntity<String> updateHotel(@RequestBody Hotel hotel){
        hotelService.updateHotel(hotel);
        return ResponseEntity.ok(hotel.getHotelName() + " updated");
    }

    @DeleteMapping("/hotels/hotel-by-id/{hotelId}")
    public ResponseEntity<Void> deleteHotel(@PathVariable int hotelId){
        hotelService.deleteHotel(hotelId);
        return ResponseEntity.ok().build();
    }
}
