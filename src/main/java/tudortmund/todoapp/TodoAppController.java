package tudortmund.todoapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoAppController {
    @RequestMapping
    public String hellowWorld(){
        return "Hello World from spring boot";
    }

}
