package com.anthony1314.dao;

import com.anthony1314.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @program: seckill
 * @description: 商品信息接口
 * @author: anthony1314
 * @create: 2019-11-20 10:03
 **/
public interface SeckillDao {

    /**
     *
     *
     * @description: 减库存
     * @return: int
     * @author: anthony1314
     * @time: 2019/11/20 10:04
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     *
     *
     * @description: 根据id查询秒杀的商品信息
     * @param seckillId
     * @return: Seckill
     * @author: anthony1314
     * @time: 2019/11/20 10:05
     */
    Seckill queryById(long seckillId);


    /**
     *
     *
     * @description: 根据偏移量查询秒杀商品列表
     *
     * @return: List<Seckill>
     * @author: anthony1314
     * @time: 2019/11/20 13:38
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
    /*
    * java没有保存形参的记录，java在运行的时候会把
    * List<Seckill> queryAll(int offset,int limit);
    * 中的参数变成这样:
    * queryAll(int arg0,int arg1),
    * 这样我们就没有办法去传递多个参数。
    * */

}
