package com.google.shinyay.client

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component


@Component
class KafkaSenderExample {

    val kafkaTemplate: KafkaTemplate<String, String>? = null
}