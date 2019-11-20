package com.anthony1314.service;

import com.anthony1314.dto.Exposer;
import com.anthony1314.dto.SeckillExecution;
import com.anthony1314.entity.Seckill;
import com.anthony1314.exception.RepeatKillException;
import com.anthony1314.exception.SeckillCloseException;
import com.anthony1314.exception.SeckillException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: seckill
 * @description: 秒杀Service接口设计
 * @author: anthony1314
 * @create: 2019-11-20 15:42
 **/
public interface SeckillService {


    /**
     *
     *
     * @description: 查询全部的秒杀记录
     * @param
     * @return: List<Seckill>
     * @author: anthony1314
     * @time: 2019/11/20 15:43
     */
    List<Seckill> getSeckillList();

    /**
     *
     *
     * @description: 查询单个秒杀记录
     * @param seckillId
     * @return: Seckill
     * @author: anthony1314
     * @time: 2019/11/20 16:38
     */
    Seckill getById(long seckillId);

    /**
     *
     *
     * @description: 在秒杀开启时输出秒杀接口的地址，否则输出系统时间和秒杀时间
     * @param seckillId
     * @return: Exposer
     * @author: anthony1314
     * @time: 2019/11/20 15:45
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     *
     *
     * @description: 执行秒杀操作，有可能失败，有可能成功，所以要抛出我们允许的异常
     * @param seckillId
     * @param userPhone
     * @param md5
     * @return: SeckillExecution
     * @author: anthony1314
     * @time: 2019/11/20 15:48
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, RepeatKillException, SeckillCloseException;


}
