package com.google.shinyay.client

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.support.SendResult
import org.springframework.stereotype.Component
import org.springframework.util.concurrent.ListenableFuture
import org.springframework.util.concurrent.ListenableFutureCallback


@Component
class KafkaSenderExample(val kafkaTemplate: KafkaTemplate<String?, String?>?) {

    fun sendMessage(topicName: String, message: String) {
        kafkaTemplate?.send(topicName, message)
    }

    fun sendMessageWithCallback(topicName: String, message: String) {
        val future: ListenableFuture<SendResult<String?, String?>> = kafkaTemplate!!.send(topicName, message)
        future.addCallback(object : ListenableFutureCallback<SendResult<String?, String?>?> {
            override fun onSuccess(result: SendResult<String?, String?>?) {
            }

            override fun onFailure(ex: Throwable) {
            }
        })
    }
}