package com.restexample.restsample;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final List<String> messages = new ArrayList<>();

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/messages")
    public List<String> getMessages() {
        List<String> myList = new ArrayList<>();
        myList.add("one");
        myList.add("two");
        return messages;
    }

    @PostMapping("/messages")
    public String addMessage(@RequestBody String message) {
        messages.add(message);
        return "Message added: " + message;
    }

    @PutMapping("/messages/{index}")
    public String updateMessage(@PathVariable int index, @RequestBody String updatedMessage) {
        if (index < messages.size()) {
            messages.set(index, updatedMessage);
            return "Message updated at index " + index + ": " + updatedMessage;
        } else {
            return "Invalid index";
        }
    }

    @DeleteMapping("/messages/{index}")
    public String deleteMessage(@PathVariable int index) {
        if (index < messages.size()) {
            String removedMessage = messages.remove(index);
            return "Message removed at index " + index + ": " + removedMessage;
        } else {
            return "Invalid index";
        }
    }
}