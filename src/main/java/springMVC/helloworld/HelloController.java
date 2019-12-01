package springMVC.helloworld;

import com.alibaba.fastjson.JSON;
import springMVC.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("all")
@Controller
public class HelloController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC World !");
        return "index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String  checkLogin(@RequestParam(value = "email") String email,
                              @RequestParam(value = "pwd") String pwd){
        System.out.println(email + " " + pwd);
        return "SUCCESS";
    }

    @RequestMapping(value ="/test",method = RequestMethod.GET)
    public String accessIndex(ModelMap model){
        model.addAttribute("message", "This is a test");
        return "index";
    }
    @RequestMapping(value = "/test/email/{email}")
    @ResponseBody
    public String loginView(@PathVariable String email){
        System.out.println("HelloController : " + email);
        return email;
    }
    @RequestMapping(value = "/test/reqBody",method = RequestMethod.POST)
    @ResponseBody
    public String userBody(@RequestParam String  userName){
        System.out.println(userName);
        return JSON.toJSONString(userName);
    }
    public String modelTest(){
        return "";
    }


}
