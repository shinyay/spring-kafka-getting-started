package com.google.shinyay.config

import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.ProducerFactory

@Configuration
class KafkaProducerConfig {

    @Value("\${io.reflectoring.kafka.gbootstrap-servers}")
    private val bootstrapServers: String? = null

    @Bean
    fun producerConfigs(): Map<String, Any?>? {
        val props: MutableMap<String, Any?> = HashMap()
        props[ProducerConfig.BOOTSTRAP_SERVERS_CONFIG] = bootstrapServers
        props[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = StringSerializer::class.java
        return props
    }

    @Bean
    fun producerFactory(): ProducerFactory<String?, String?>? {
        return DefaultKafkaProducerFactory(producerConfigs()!!)
    }

}