package com.d2f.camunda.rentacar;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutomaticNotification implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger("LOAN-REQUESTS");

    public void execute(DelegateExecution execution) {
        logger.info("Automatic notification for user : {}", execution.getVariable("customerId"));
    }
}