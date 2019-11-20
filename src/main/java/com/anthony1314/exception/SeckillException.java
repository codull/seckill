package com.anthony1314.exception;

/**
 * @program: seckill
 * @description: 秒杀相关的所有业务异常
 * @author: anthony1314
 * @create: 2019-11-20 15:50
 **/

public class SeckillException extends RuntimeException  {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
