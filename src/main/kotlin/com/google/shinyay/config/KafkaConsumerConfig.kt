package com.google.shinyay.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class KafkaConsumerConfig {

    @Value("\${io.reflectoring.kafka.bootstrap-servers}")
    private val bootstrapServers: String? = null
}