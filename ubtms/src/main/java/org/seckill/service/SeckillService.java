package org.seckill.service;

import java.util.List;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

public interface SeckillService {
	List<Seckill> getSeckillList();
	Seckill getById(long seckillId);
	Exposer exportSeckillUrl(long seckillId);
	SeckillExecution executeSeckill(long seckillId, long phone, String md5) throws
	SeckillException,RepeatKillException, SeckillCloseException;
	
}
