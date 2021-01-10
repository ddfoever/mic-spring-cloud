package com.itan.service;

import com.itan.entity.Payment;

import java.util.List;

public interface PayService {

    List<Payment> findAll();

    Payment findById(long id);

    Integer insert(Payment payment);
}
