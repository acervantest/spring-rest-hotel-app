package com.rest.service;

import com.rest.models.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenusByHotel(String hotelName);
}
