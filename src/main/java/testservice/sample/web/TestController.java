package testservice.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import testservice.sample.service.TestVO;

@Controller //reqUrl.do 요청시 아래 구문 수행 (서버 요청 등록)
public class TestController {
	@RequestMapping(value = "/reqUrl.do")
	public String selectSampleList(@ModelAttribute("searchVO") TestVO searchVO, ModelMap model) throws Exception{
		return "redirect:http://www.naver.com";
	}

}
