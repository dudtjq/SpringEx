package com.dudtjq.spring.ex.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dudtjq.spring.ex.database.dao.UsedGoodsDAO;
import com.dudtjq.spring.ex.database.model.UsedGoods;

@Service	
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO;
	
	// used_goods 모든 데이터 조회 리턴 메소드
	public List<UsedGoods> getUsedGoodsList() {
		
		List<UsedGoods> usedGoodsList = usedGoodsDAO.selectUsedGoodsList();
		
		// 데이터 가공
		return usedGoodsList;
		
	}
}
