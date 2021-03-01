package com.rest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hotel {
    @Id
    @GeneratedValue(generator = "hotel_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "hotel_id", sequenceName = "hotel_id")
    private Integer hotelId;
    private String hotelName;
    @OneToOne
    private Address address;
    @OneToMany
    private Set<Menu> menuList;
    @ManyToMany
    private Set<Delivery> delivery;

    public Hotel(String hotelName, Address address, Set<Menu> menuList, Set<Delivery> delivery) {
        this.hotelName = hotelName;
        this.address = address;
        this.menuList = menuList;
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", address=" + address +
                ", menuList=" + menuList +
                ", delivery=" + delivery +
                '}';
    }
}
