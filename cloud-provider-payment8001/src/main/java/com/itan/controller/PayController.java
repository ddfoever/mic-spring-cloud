package com.itan.controller;

import com.itan.common.CommonResult;
import com.itan.common.ResultCodeEnum;
import com.itan.entity.Payment;
import com.itan.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PayController {

    @Resource
    private PayService payService;

    @GetMapping("/all")
    public CommonResult findAll(){
        return new CommonResult(payService.findAll(),ResultCodeEnum.SUCCESS);
    }

    @GetMapping("/payment/{id}")
    public CommonResult findById(@PathVariable("id") long id){

        return new CommonResult(payService.findById(id),ResultCodeEnum.SUCCESS);
    }


    @GetMapping("/test")
    public String test(){

        return "payService.findAll()";
    }

    @PostMapping("/insert")
    public CommonResult insert(@RequestBody Payment payment){
        CommonResult result = new CommonResult();
        Integer insert = payService.insert(payment);
        if(insert >0){
            return new CommonResult(insert,ResultCodeEnum.SUCCESS);
        }
        return new CommonResult(ResultCodeEnum.FAILURE);
    }


}
