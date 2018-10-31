package starter.controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Say_Hello {
    @RequestMapping("/test")
    @ResponseBody
    public String sayHello(){
        System.out.print("hello111");
        return "Hello";
    }

}
