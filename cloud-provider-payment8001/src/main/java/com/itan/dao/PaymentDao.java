package com.itan.dao;

import com.itan.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentDao {

    List<Payment> findAll();

    Payment findById(long id);

    Integer insert(Payment payment);

    Integer update(Payment payment);

    Integer delete(long id);
}
