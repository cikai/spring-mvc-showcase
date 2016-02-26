package ps.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ps.demo.beans.Person;

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

    @RequestMapping(value="/demo1",method=RequestMethod.POST)
    public String demo1(String name, int age){
        debug("demo1", String.format("name is [%s], age is [%d]", name, age));
        return "redirect:/";
    }

    @RequestMapping(value="/demo2", method=RequestMethod.POST)
    public String demo2(Person p){
        debug("demo2", p.toString());
        return "index";
    }

    @RequestMapping(value="/demo3", method=RequestMethod.POST)
    public String demo3(Person p){
        debug("demo3", p.toString());
        return "index";
    }

    @RequestMapping(value="/demo4", method=RequestMethod.POST)
    public String demo4(@RequestBody Person p){
        debug("demo4", p.toString());
        return "index";
    }

    @RequestMapping(value="/demo5", method=RequestMethod.POST)
    @ResponseBody
    public Map<String, String> demo5(@RequestBody Person p) {
        debug("demo5", p.toString());
        Map<String, String> m = new HashMap<String, String>();
        m.put("result", "ok");
        return m;
    }

    @RequestMapping(value="/demo6/{name}/{age}", method=RequestMethod.GET)
    public String demo6(@PathVariable("name") String name, @PathVariable("age") int age){
        debug("demo6", String.format("name is [%s], age is [%d]", name, age));
        return "index";
    }

    @RequestMapping(value="/hello")
    public String hello(){
        return "hello";
    }

    private void debug(String prefix, String msg){
        logger.debug(String.format("\r\n==【%s】==  %s\r\n", prefix, msg));
    }


}
