package com.dudtjq.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dudtjq.spring.ex.lifecycle.model.Person;

@RestController // @Controller + @ResponseBody가 합쳐 진것!
@RequestMapping("/lifecycle/ex01") // 반복되는 메소드가 많이 있을 것이기 때문에 묶을수도 있음
public class Ex01RestController {
	
	@RequestMapping("/3")
	public String stringResponse() {
		return "안녕하세요 <br> RestController 입니다.";
	}
	
	// 직접 만든 클래스 겍체를 리턴
	@RequestMapping("/4")
	public Person objectResponse() {
		
		Person person = new Person();
		
		person.setName("이영섭");
		person.setAge(28);
		
		return person;
		
	}
	
	// status 코드를 포함한 response
	@RequestMapping("/5")
	public ResponseEntity<Person> entityResponse() {
		
		Person person = new Person();
		
		person.setName("이영섭");
		person.setAge(28);
		
		// 500 에러
		ResponseEntity<Person> entity = new ResponseEntity(person, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
	}
	
}
