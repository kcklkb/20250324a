package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CICDController {

		@GetMapping("fisa1")
		public String reqRes() {
			System.out.println("reqRes() *******");
			return "요청 응답 성공";
		}
		
}
