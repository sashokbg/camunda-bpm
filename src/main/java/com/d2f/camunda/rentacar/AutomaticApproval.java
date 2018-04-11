package com.d2f.camunda.rentacar;

import com.google.gson.Gson;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.identity.Picture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutomaticApproval implements JavaDelegate {
    private Logger logger = LoggerFactory.getLogger(AutomaticApproval.class);

    public void execute(DelegateExecution execution) {
        logger.info("Automatically approving car rent: {} with amount {}", execution.getVariable("customerId"), execution.getVariable("amount"));
    }
}
