package org.seckill.dto;

import org.seckill.entity.SuccessKilled;
import org.seckill.enums.SeckillStatEnum;

/**
 * 封装秒杀执行后结果
 * @author Administrator
 *
 */
public class SeckillExecution {
	
	private long seckillId;
	//秒杀执行结果状态
	private int start;
	//状态表示
	private String stateInfo;
	//秒杀成功对象
	private SuccessKilled successKilled;
	
	
	@Override
	public String toString() {
		return "SeckillExecution [seckillId=" + seckillId + ", start=" + start + ", stateInfo=" + stateInfo
				+ ", successKilled=" + successKilled + "]";
	}


	public SeckillExecution(long seckillId, SeckillStatEnum statEnum, SuccessKilled successKilled) {
		this.seckillId = seckillId;
		this.start = statEnum.getState();
		this.stateInfo =statEnum.getStateInfo();
		this.successKilled = successKilled;
	}
	
	
	public SeckillExecution(long seckillId, SeckillStatEnum statEnum) {
		this.seckillId = seckillId;
		this.start = statEnum.getState();
		this.stateInfo =statEnum.getStateInfo();
		
	}


	public long getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public SuccessKilled getSuccessKilled() {
		return successKilled;
	}
	public void setSuccessKilled(SuccessKilled successKilled) {
		this.successKilled = successKilled;
	}
	
	
}
