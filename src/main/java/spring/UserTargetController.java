package spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class UserTargetController {
    private static final Logger log = LoggerFactory.getLogger(UserTargetController.class.getName());

    @RequestMapping(value = "targetSource", method = RequestMethod.GET)
    public ModelAndView provideTargetPage(Map<String, ?> model) {
        log.info("Welcome controller works correctly for targetSource");
        return new ModelAndView("/userTargets/targetSource", model);
    }

    @RequestMapping(value = "targetSourceNext", method = RequestMethod.GET)
    public ModelAndView provideTargetPageNext(Map<String, ?> model) {
        log.info("Welcome controller works correctly for targetSource");
        return new ModelAndView("/userTargets/targetSourceNext", model);
    }
}

