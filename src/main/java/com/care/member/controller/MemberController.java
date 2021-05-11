package com.care.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member.dto.MemberDTO;
import com.care.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	MemberService ms;
	
	@GetMapping
	public String index() {
		return "member/index";
	}
	@GetMapping("join")
	public String join() {
		return "member/join";
	}
	@PostMapping("join")
	public String join(Model model, MemberDTO dto) {
		model.addAttribute("msg", ms.join(dto) ? "회원가입에 성공했습니다." : "회원가입에 실패했습니다.");
		return "member/index";
	}
	@GetMapping("show")
	public String show(Model model) {
		model.addAttribute("list", ms.getList());
		return "member/result"; 	
	}
	
}
