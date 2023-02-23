package com.dudtjq.spring.ex.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dudtjq.spring.ex.database.model.UsedGoods;

@Repository
public interface UsedGoodsDAO {

	// used_goods 테이블 조회 리턴
	public List<UsedGoods> selectUsedGoodsList();
		
		
		
	
	
}
