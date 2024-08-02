package org.example.spring_hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class subscriberController {


    SubscriberRepository repository;

    @Autowired
    public subscriberController(SubscriberRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/subscribers")
    Subscriber newEmployee(@RequestBody Subscriber newSubscriber) {
        return repository.save(newSubscriber);
    }
}
