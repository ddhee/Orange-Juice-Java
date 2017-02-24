import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zccz14 on 2017/2/24.
 */
@Controller
@RequestMapping("/")
public class Hello {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
