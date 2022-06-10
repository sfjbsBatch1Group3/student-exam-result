package com.ms1.datas.usercontroller;

import com.ms1.datas.rabbitmq1.RequestSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @Autowired
    RequestSender requestSender;

    @GetMapping("/getresult")
    public String producer(@RequestParam String name) {

        requestSender.send(name);
        return "Student name: "+name+", sent to the RabbitMQ  Successfully";
    }
}
