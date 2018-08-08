package ogr.user12043.tutorials.spring.boot.controller;

import ogr.user12043.tutorials.spring.boot.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by ME99735 on 08.08.2018 - 08:55
 * part of project: springBoot
 */
@RestController
public class MessageController {
    private static final String messagePrefix = "Ne var ";
    private final AtomicLong counter = new AtomicLong();

    // Üçü de olur
    //    @RequestMapping(method = RequestMethod.GET, path = "/message")
    //    @RequestMapping(method = RequestMethod.GET, value = "/message")
    @GetMapping("/message")
    public Message message(@RequestParam(defaultValue = "unnamed hero") String name) {
        Message message = new Message();
        message.setId(counter.incrementAndGet());
        message.setMessage(messagePrefix.concat(name));
        return message;
    }
}
