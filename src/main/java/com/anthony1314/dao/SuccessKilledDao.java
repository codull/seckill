package com.anthony1314.dao;

import com.anthony1314.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

/**
 * @program: seckill
 * @description: 秒杀信息接口
 * @author: anthony1314
 * @create: 2019-11-20 13:38
 **/
public interface SuccessKilledDao {
    /**
     *
     *
     * @description:  插入购买明细,可过滤重复
     * @return: int
     * @author: anthony1314
     * @time: 2019/11/20 14:27
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);


    /**
     *
     *
     * @description: 根据秒杀商品的id查询明细SuccessKilled对象(该对象携带了Seckill秒杀产品对象)
     * @param seckillId
     * @param userPhone
     * @return: SuccessKilled
     * @author: anthony1314
     * @time: 2019/11/20 14:28
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);

}
