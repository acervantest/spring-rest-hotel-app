package com.rest;

import com.rest.models.Address;
import com.rest.models.Delivery;
import com.rest.models.Hotel;
import com.rest.models.Menu;
import com.rest.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class RestHotelAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestHotelAppApplication.class, args);
	}

	@Autowired
	HotelService hotelService;

	@Override
	public void run(String... args) throws Exception {

		Address address = new Address("Hoskins Road", "North Vancouver", 80900, "BC");
		Menu menu1 = new Menu("Burguer and Fries", 20);
		Menu menu2 = new Menu("Pizza", 45);
		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));
		Delivery delivery1 = new Delivery("uber eats", 2);
		Delivery delivery2 = new Delivery("skip dishes", 2);
		Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(delivery1, delivery2));

		Hotel hotel = new Hotel("Air B", address, menuList, deliveryList);
		hotelService.addHotel(hotel);
	}
}
