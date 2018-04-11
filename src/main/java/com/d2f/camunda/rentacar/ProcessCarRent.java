package com.d2f.camunda.rentacar;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class ProcessCarRent implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(ProcessCarRent.class);

    public void execute(DelegateExecution execution) {
        logger.info("Processing car rental for customer {} for a car {} of type {} of amount {} '",
                execution.getVariable("customerId"),
                execution.getVariable("car"),
                execution.getVariable("car_type"),
                execution.getVariable("amount")
                );
    }
}
