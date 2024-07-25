package study.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {

    @RequestMapping("/fragment")
    public String template() {
        return "template/fragment/fragmentMain";
    }
}
