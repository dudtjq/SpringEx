package com.dudtjq.spring.ex.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dudtjq.spring.ex.jsp.bo.UserBO;
import com.dudtjq.spring.ex.jsp.model.User;

@Controller
@RequestMapping("/ajax/user")
public class NewUserController {

	@Autowired
	private UserBO userBO;
	
	@GetMapping("/user")
	public String userList(Model model) {
		
		List<User> userList = userBO.getUserList();
		
		model.addAttribute("userList", userList);
		
		return "ajax/user/user";
		
	}
	
	@GetMapping("/add")
	@ResponseBody
	public Map<String, String> addUser(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("email") String email
			, @RequestParam("introduce") String introduce
			) {
		
		int count = userBO.addUser(name, birthday, email, introduce);
		
		// 성공 여부 json
		// 성공 : {"result":success}
		// 실패 : {"result":fail}
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) { // 성공
			resultMap.put("result", "success");
		} else { // 실패
			resultMap.put("result", "fail");
		}
		
		return resultMap;
		
	}
	
	@GetMapping("/input")
	public String inputUser() {
		
		return "ajax/user/userInpnt";
		
	}
	
}