package com.d2f.camunda.rentacar;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessNotifications implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger("LOAN-REQUESTS");

    public void execute(DelegateExecution execution) {
        logger.info("Notifying user : {} with message {}", execution.getVariable("customerId"), execution.getVariable("notification"));
    }
}