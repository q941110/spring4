package chanhee.setting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import chanhee.setting.service.MemberService;

@Controller
public class HomeController {
	
	private MemberService memberService;
	
	@Autowired
	public HomeController(MemberService memberService) {
		this.memberService = memberService;
	}

	@GetMapping(path = "/")
    public String hello(Model model){
		model.addAttribute("member", memberService.getAll());
		
        return "hello";
    }
}
