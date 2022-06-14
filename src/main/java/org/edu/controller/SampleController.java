package org.edu.controller;

import org.edu.domain.SampleVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public String sqyHello() {
		return "Hello World";
	}
	
	//--------------------------------------------------------------------------------------------------
	//--------------------------------------------------------------------------------------------------
	@GetMapping("/sample")
	public SampleVO makeSample() {
		
		SampleVO vo = new SampleVO();
		vo.setVal1("value1");
		vo.setVal2("value2");
		vo.setVal3("value3");
		
		System.out.println(vo);
		
		return vo;
	}
}
