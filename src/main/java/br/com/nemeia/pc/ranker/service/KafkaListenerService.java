package br.com.nemeia.pc.ranker.service;

import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@EnableKafka
@Service
public class KafkaListenerService {

    @KafkaListener(topics = "pc.gpu")
    public void gpuListener(String message) {
        System.out.println("Received Message: " + message);
    }

}
