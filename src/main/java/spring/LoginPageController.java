package spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
//Controller for loginPage.jsp, return

@Controller
public class LoginPageController {
    private static final Logger log = LoggerFactory.getLogger(LoginPageController.class.getName());

    @RequestMapping(value = "loginPage", method = RequestMethod.GET)
    public ModelAndView provideWelcomePage(Map<String, ?> model) {
        log.info("Welcome controller works correctly for loginPage");
        return new ModelAndView("/auth/loginPage", model);
    }
}
