package com.d2f.camunda.rentacar;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class ProcessRequest implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(ProcessRequest.class);

    public void execute(DelegateExecution execution) {
        logger.info("SPRING BOOT Processing request by '" + execution.getVariable("customerId") + "'...");
    }
}
