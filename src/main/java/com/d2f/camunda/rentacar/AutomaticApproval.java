package com.d2f.camunda.rentacar;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AutomaticApproval implements JavaDelegate {
    private Logger logger = LoggerFactory.getLogger(AutomaticApproval.class);

    public void execute(DelegateExecution execution) {
        logger.info("Automatically approving car rent: {} with amount {}", execution.getVariable("customerId"), execution.getVariable("amount"));
    }
}
