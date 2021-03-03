package com.rest.service;

import com.rest.models.Delivery;

public interface DeliveryService {

    void updateDelivery(Delivery delivery);
    Delivery getDeliveryById(int deliveryId);
    Delivery getDeliveryByPartner(String partnerName);
    void deleteDelivery(int deliveryId);
}
