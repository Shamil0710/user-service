package kafka.impl;

import kafka.KafkaProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

@Slf4j
@Component
public class KafkaProducerImpl implements KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String key, String msg) {
        log.info("Получено KEY = " + key + "Value = " + msg);
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("${from_source_topic}", key, msg);
        log.info("Записано в топик " + "${from_source_topic}" + "  " + future);
    }
}
