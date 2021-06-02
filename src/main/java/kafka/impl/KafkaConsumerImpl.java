package kafka.impl;

import kafka.KafkaConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumerImpl implements KafkaConsumer {
    @Override
    @KafkaListener(topics = "${from_database_topic}", containerFactory = "kafkaListenerContainerFactory")
    public void listen(String message) {
        log.info("Получаем из кафки сообщение " + message);

        //TODO Некая волшебная лоигка обработки сообщений
    }

}
