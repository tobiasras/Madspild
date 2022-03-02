package keadat21b.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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


}
