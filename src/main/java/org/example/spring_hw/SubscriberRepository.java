package org.example.spring_hw;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {

}
