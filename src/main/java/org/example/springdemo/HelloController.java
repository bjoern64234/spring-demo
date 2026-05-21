package org.example.springdemo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name;
    }

    @GetMapping("/messages")
    public Map<String, Message> getMessages() {
        return this.helloService.getMessages();
    }

    @PostMapping("/messages")
    public void saveMassage(@RequestBody Message message) {
        this.helloService.getMessages().put(message.id(), message);
    }

    @DeleteMapping("/message/{id}")
    public void deleteMessage(@PathVariable String id) {
        this.helloService.getMessages().remove(id);
    }
}
