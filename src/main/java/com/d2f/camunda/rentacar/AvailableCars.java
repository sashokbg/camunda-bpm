package com.d2f.camunda.rentacar;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.variable.Variables;

import java.util.HashMap;
import java.util.Map;

import static org.camunda.bpm.engine.variable.Variables.objectValue;

public class AvailableCars implements ExecutionListener {

    @Override
    public void notify(DelegateExecution execution) throws Exception {
        Map<String, String> cars = new HashMap<>();
        cars.put("001", "Nissan");
        cars.put("002", "VW Golf");
        cars.put("003", "BMW Series 3");

        execution.setVariable("cars", objectValue(cars) .serializationDataFormat(Variables.SerializationDataFormats.JSON).create());
    }
}
