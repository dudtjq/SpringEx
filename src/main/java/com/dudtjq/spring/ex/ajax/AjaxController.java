package com.dudtjq.spring.ex.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	// 사람정보 : 이름, 나이 정보를 json으로 response에 담는 기능
	@GetMapping("/ajax/ajax")
	@ResponseBody
	public Map<String, Object> restRequest() {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("name", "이영섭");
		map.put("age", 28);
		
		return map;
		
	}
	
	@GetMapping("/ajax/ex01")
	public String ajaxPage() {
		
		return "ajax/ex01";
		
	}
	
}
