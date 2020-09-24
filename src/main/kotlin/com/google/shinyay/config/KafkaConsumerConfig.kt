package com.google.shinyay.config

import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory


@Configuration
class KafkaConsumerConfig {

    @Value("\${io.reflectoring.kafka.bootstrap-servers}")
    private val bootstrapServers: String? = null

    @Bean
    fun consumerConfigs(): Map<String, Any>? {
        val props: MutableMap<String, Any> = HashMap()
        props[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = bootstrapServers!!
        props[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
        return props
    }

    @Bean
    fun consumerFactory(): ConsumerFactory<String?, String?>? {
        return DefaultKafkaConsumerFactory<String?, String?>(consumerConfigs()!!)
    }
}