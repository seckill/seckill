package org.seckill.dao;
import org.springframework.test.context.jdbc.Sql;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

/**
	 * 
	 * @author Administrator
	 *
	 */
public interface SeckillDao {
		/**
		 * 减库存
		 * @param seckillId
		 * @param killTime
		 * @return
		 * 如果影响行数>1,表示更新的记录行数
		 */
	int reduceNumber(long seckillId,Date killTime);
		/**
		 * 根据id查询秒杀对象
		 * @param seckillId
		 * @return
		 */
	Seckill queryById(long seckillId);
	/**
	 * 根据偏移量查询秒杀商品列表
	 * @param offet
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(@Param("offset")int offet,@Param("limit")int limit);
	//offet 偏移量
	//limit 在偏移量之后取多少条记录
}
