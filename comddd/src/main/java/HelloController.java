import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class HelloController {

    @Resource
    private HelloService helloService;
}