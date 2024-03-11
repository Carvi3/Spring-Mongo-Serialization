package carv.springwithmongo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DefaultController {

    @GetMapping("ping")
    public String getMethodName() {
        return "pong";
    }
    
    
}
