package kafka;

import org.springframework.kafka.annotation.KafkaListener;

public interface KafkaConsumer {
    @KafkaListener(topics = "${from_database_topic}", containerFactory = "kafkaListenerContainerFactory")
    void listen(String message);
}
