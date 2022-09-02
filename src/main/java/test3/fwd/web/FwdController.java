package test3.fwd.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import test3.fwd.service.FwdVO;

@Controller
public class FwdController {
	@RequestMapping(value = "/reqUrl.do")
	public String selectReqUrl(@ModelAttribute("searchVO") FwdVO searchVO, ModelMap model) throws Exception{
		return "redirect:https://www.naver.com/";
	}
	
	@GetMapping("/main.do")
	public String mainPage() {
		return "main";
	}
	@GetMapping("/detail.do")
	public String detailPage() {
		return "detail";
	}
	@GetMapping("/display.do")
	public String displayPage() {
		return "display";
	}
	@GetMapping("/risk.do")
	public String riskPage() {
		return "risk";
	}


}
