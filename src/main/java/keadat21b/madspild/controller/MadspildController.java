package keadat21b.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MadspildController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/info")
    public String info(){
        return "info";
    }

@GetMapping("/artikel")
    public String artikel(){
        return "artikel";
}


}
