package com.d2f.camunda.rentacar;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class RentACarConfig {
    private Logger logger = LoggerFactory.getLogger(RentACarConfig.class);

    @Autowired
    private RuntimeService runtimeService;

    @EventListener
    private void processPostDeploy(PostDeployEvent event) {
        logger.info("Called postdeploy 444 for event {}", event);
        //runtimeService.startProcessInstanceByKey("approve-car-rent-process");
    }
}
