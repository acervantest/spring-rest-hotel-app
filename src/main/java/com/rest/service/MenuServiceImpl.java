package com.rest.service;

import com.rest.models.Menu;
import com.rest.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    MenuRepository menuRepository;

    @Override
    public List<Menu> getMenusByHotel(String hotelName) {
        return menuRepository.findByHotelNative(hotelName);
    }
}
