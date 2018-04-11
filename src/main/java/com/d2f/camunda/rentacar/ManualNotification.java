package com.d2f.camunda.rentacar;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManualNotification implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger("LOAN-REQUESTS");

    public void execute(DelegateExecution execution) {
        logger.info("Manual Notification for user : {} with message {}", execution.getVariable("customerId"), execution.getVariable("notification"));
    }
}