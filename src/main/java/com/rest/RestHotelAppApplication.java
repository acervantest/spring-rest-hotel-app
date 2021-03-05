package com.rest;

import com.rest.models.Address;
import com.rest.models.Delivery;
import com.rest.models.Hotel;
import com.rest.models.Menu;
import com.rest.service.DeliveryService;
import com.rest.service.HotelService;
import com.rest.service.MenuService;
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

	@Autowired
	DeliveryService deliveryService;

	@Autowired
	MenuService menuService;

	@Override
	public void run(String... args) throws Exception {

		/*Address address = new Address("Granville Street", "Downtown Vancouver", 80900, "BC");
		Menu menu1 = new Menu("Burguer and Fries", 20);
		Menu menu2 = new Menu("Pizza", 15);
		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1, menu2));
		Delivery delivery1 = deliveryService.getDeliveryByPartner("swiggy");
		Set<Delivery> deliveryList = new HashSet<>(Arrays.asList(delivery1));

		Hotel hotel = new Hotel("Trump Tower", address, menuList, deliveryList);
		hotelService.addHotel(hotel);*/

		/*Hotel h = hotelService.getHotelById(152);
		h.getDelivery().add(deliveryService.getDeliveryByPartner("skip the dishes"));
		System.out.println(h);
		hotelService.updateHotel(h); */

		/*hotelService.getHotelsByCity("Downtown Vancouver")
				.stream()
				.forEach(System.out::println);
		System.out.println();
		hotelService.getHotelsByLocation(" Street")
				.stream()
				.forEach(System.out::println);*/
		/*hotelService.getHotelsByMenu("Burguer and Fries")
				.stream()
				.forEach( h -> System.out.println(h.getHotelName()+ " - " +h.getAddress().getStreetName()));

		System.out.println();

		hotelService.getHotelsByDelivery("uber eats")
				.stream()
				.forEach( h -> System.out.println(h.getHotelName() + " - " + h.getAddress().getStreetName()));

		System.out.println();

		hotelService.getHotelsByLocationAndMenu("Granville Street", "Pizza")
				.stream()
				.forEach( h -> System.out.println(h.getHotelName() + " - " + h.getAddress().getCity()));*/

		/*menuService.getMenusByHotel("Silvia Hotel")
				.stream()
				.forEach( m -> System.out.println(m.getHotel().getHotelName() + ": " + m.getMenuName() ));*/


	}
}
