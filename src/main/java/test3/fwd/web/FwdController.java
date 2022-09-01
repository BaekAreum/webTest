package test3.fwd.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import test3.fwd.service.FwdVO;

@Controller
public class FwdController {
	@RequestMapping(value="/reqUrl.do")
	public String selectReqUrl(@ModelAttribute("searchVO") FwdVO searchVO, ModelMap model) throws Exception{
		return "redirect:http://www.naver.com";
	}
}
