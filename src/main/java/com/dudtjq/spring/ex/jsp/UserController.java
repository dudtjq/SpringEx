package com.dudtjq.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dudtjq.spring.ex.jsp.bo.UserBO;
import com.dudtjq.spring.ex.jsp.model.User;

@Controller
@RequestMapping("/jsp/user")
public class UserController {
	
	@Autowired
	private UserBO userBO;
	
	// 이름, 생년월일, 이메일, 자기소개 전달받고 데이터 저장
	// @RequestMapping 기본값으로 get 메소드임
//	@RequestMapping(path="/add", method=RequestMethod.GET)
	@PostMapping("/add")
//	@ResponseBody
	public String addUser(
				@RequestParam("name") String name
				, @RequestParam("birthday") String birthday
				, @RequestParam("email") String email
				, @RequestParam("introduce") String introduce
				, Model model) {
		
//	 int count = userBO.addUser(name, birthday, email, introduce);
//		
//		 return "삽입결과 : " + count;
		
		// 방금 insert 한 id를 얻어 온다.
		// 객체로 전달
		
		User user = new User();
		user.setName(name);
		user.setBrithday(birthday);
		user.setEmail(email);
		user.setIntroduce(introduce);
		
		int count = userBO.addUserObject(user);
		
		model.addAttribute("user", user); 
		
		return "jsp/lastUser";
	}
	
	// jsp 파일 맵핑
	@GetMapping("/input")
	public String userInput() {
		return "jsp/UserInput";
	}
	
	// 가장 최근에 등록된 사용자 정보를 html로 구성 한다.
	@GetMapping("/lastUser")
	public String lastUser(Model model) {
		
		// 최근 등록된 사용자 조회
		User lastUser = userBO.getLastUser();
		
		// 조회된 결과를 jsp 에서 쓸수 있도록 셋팅
		model.addAttribute("user", lastUser);
		
		return "jsp/lastUser";
	}
	
	
}
