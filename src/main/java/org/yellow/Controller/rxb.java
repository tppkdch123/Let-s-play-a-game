package org.yellow.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class rxb {
    @RequestMapping("huang")
    @ResponseBody
    public String test() {
        return "hello world";
    }
}
