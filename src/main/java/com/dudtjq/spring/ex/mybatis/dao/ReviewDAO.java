package com.dudtjq.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dudtjq.spring.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {

	public Review selectReview(@Param("id") int id);
	
	// 리턴 타입은 실행된 행의 갯수로 지정을 해준다
	public int insertReview(
			@Param("storeId")	int storeId
			, @Param("menu") String menu
			, @Param("userName") String userName
			, @Param("point") double point
			, @Param("review") String review);
	
	public int insertReviewByObject(Review review);
	
}
