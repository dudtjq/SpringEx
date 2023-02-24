package com.dudtjq.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dudtjq.spring.ex.mybatis.bo.ReviewBO;
import com.dudtjq.spring.ex.mybatis.model.Review;

@Controller
@RequestMapping("/mybatis")
public class ReviewController {

	@Autowired
	private ReviewBO reviewBO;
	
	// 전달받은 id와 일치하는 데이터 조회 그결과를 json으로 response 담기
	@RequestMapping("/ex01")
	@ResponseBody
	public Review review(
//		@RequestParam("id") int id // 기본 형태
//		@RequestParam(value="id", required=false) int id	비필수 파라미터
		@RequestParam(value="id", defaultValue="3") int id	
				
			) {
		
//		int id = Integer.parseInt(request.getParameter("id"));
		Review review = reviewBO.getReview(id);
		
		return review;
	}
	
	// 새로운 리뷰를 등록하는 기능
	@RequestMapping("/ex02")
	@ResponseBody
	public String addReview() {
		// 4, "콤비네이션피자", "이영섭", 4.5, "할인도 많이 받고 잘 먹었어요" 
//		int count = reviewBO.addReview(4, "콤비네이션피자", "이영섭", 4.5, "할인도 많이 받고 잘 먹었어요.");
		
		Review review = new Review();
		review.setstoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("이영섭");
		review.setPoint(4.8);
		review.setReview("맛나용");
		
		int count = reviewBO.addReviewByObject(review);
		
		// 실행결과 : 1
		return "실행결과 : " + count;
	}
	
}
