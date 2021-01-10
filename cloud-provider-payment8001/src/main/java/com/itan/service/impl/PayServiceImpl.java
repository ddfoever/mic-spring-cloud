package com.itan.service.impl;

import com.itan.dao.PaymentDao;
import com.itan.entity.Payment;
import com.itan.service.PayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PayServiceImpl implements PayService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public List<Payment> findAll() {
        return paymentDao.findAll();
    }

    @Override
    public Payment findById(long id) {
        return paymentDao.findById(id);
    }

    @Override
    public Integer insert(Payment payment) {
        return paymentDao.insert(payment);
    }
}
