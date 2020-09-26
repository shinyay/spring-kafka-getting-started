package com.google.shinyay.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder


@Configuration
class KafkaTopicConfig {

    @Value("\${io.reflectoring.kafka.topic-1}")
    private val topic1: String? = null

    @Bean
    fun topic1(): NewTopic? = TopicBuilder.name(topic1).build()
}