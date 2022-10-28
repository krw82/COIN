package com.example.demo.Controller;

import java.util.List;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ChartService;
import com.example.demo.Service.IMMemberService;
import com.example.demo.Vo.MarketCode;
import com.example.demo.Vo.member;
import com.example.demo.common.common;

@Controller
public class MemberController {
	@Autowired IMMemberService MemberService;
	@Autowired ChartService service;
	
	@GetMapping("/test")
	public String test(@RequestParam String ID, @RequestParam String PASSWORD, Model model) {
		member member =MemberService.selectMember(ID);
		if(member != null && member.getPASSWORD().equals(common.gf_trim(PASSWORD))) {
			return "main";
		}
		else {
			return "test";
		}
		
		
		
	}

	@GetMapping("/")
	public String test( Model model) {
	  service.setMarketCode();
	  
		return "test";
	}

	

}
