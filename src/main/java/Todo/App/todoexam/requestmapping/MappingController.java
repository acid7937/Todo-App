package Todo.App.todoexam.requestmapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

    @RequestMapping({"/todo-basic", "/todo-go"})
    public String helloBasic() {
        return "‘To-do Application !’";

    }
}
