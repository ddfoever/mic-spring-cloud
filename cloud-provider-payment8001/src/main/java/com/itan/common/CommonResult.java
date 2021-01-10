package com.itan.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    /**
     * 两个参数的构造函数
     * @param code
     * @param message
     */
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

    public CommonResult(ResultCodeEnum resultCodeEnum){
        this(resultCodeEnum.getCode(),resultCodeEnum.getMsg());
    }

    public CommonResult(T data,ResultCodeEnum resultCodeEnum){
        this.data = data;
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMsg();
    }

}
