package com.cibertec.appGrupo08Productor.service;

import com.cibertec.appGrupo08Productor.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductorService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarNumeros(String numbers) {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE_NAME,
                RabbitMQConfig.ROUTING_KEY,
                numbers
        );
    }

}