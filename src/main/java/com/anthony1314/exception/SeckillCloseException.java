package com.anthony1314.exception;

/**
 * @program: seckill
 * @description: 秒杀关闭异常，当秒杀结束时用户还要进行秒杀就会出现这个异常
 * @author: anthony1314
 * @create: 2019-11-20 15:52
 **/

public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
