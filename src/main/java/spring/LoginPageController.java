package spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
//Controller return view for loginPage.jsp

@Controller
public class LoginPageController {

    public static final String PATH_TO_LOGIN_PAGE = "/auth/loginPage";

    private static final Logger log = LoggerFactory.getLogger(LoginPageController.class.getName());

    @RequestMapping(value = "loginPage", method = RequestMethod.GET)
    public ModelAndView provideWelcomePage(Map<String, ?> model) {
        log.info("Welcome controller works correctly for loginPage");
        return new ModelAndView(PATH_TO_LOGIN_PAGE, model);
    }
}
