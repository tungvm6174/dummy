package my.test;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
 
@Controller
@RequestMapping("/")
public class BaseController {
 
  @RequestMapping(value="welcome", method = RequestMethod.GET)
  public String welcome(ModelMap model) {
    model.addAttribute("message", "OK, remember the web-app_2_4.xsd");
    //Spring uses InternalResourceViewResolver and return back index.jsp
    return "index";
 
  }
 
  @RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
  public String welcomeName(@PathVariable String name, ModelMap model) {
    model.addAttribute("message", "hello - " + name);
    return "index";
 
  }
 
}
