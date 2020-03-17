package server.sentinel;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/")
    @SentinelResource("hello")
    public String hello() {
        return echoService.echo("abc");
    }
}
