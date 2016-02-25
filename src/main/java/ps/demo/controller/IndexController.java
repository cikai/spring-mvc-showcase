package ps.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping("/")
    public String root(){
        return "index";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/index.html")
    public String indexHtml(){
        return "index";
    }

    @RequestMapping(value="/form1",method=RequestMethod.POST)
    public String form1(String name, int age){
        logger.debug(String.format("name is [%s], age is [%d]", name, age));
        return "index";
    }


}
