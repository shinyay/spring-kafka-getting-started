package com.google.shinyay.client

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.RoutingKafkaTemplate
import org.springframework.stereotype.Component


@Component
class KafkaSenderExample(kafkaTemplate: KafkaTemplate<String?, String?>?) {

    val kafkaTemplate: KafkaTemplate<String, String>? = null
}