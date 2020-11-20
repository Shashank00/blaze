package com.axis.blaze.controllers;

import com.axis.blaze.models.BlazeDecisionCalculationRequest;
import com.axis.blaze.models.BlazeVariableCalculationRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class BlazeController {

    @RequestMapping(value = "/blazeVariableCalculate", method = RequestMethod.POST)
    public Map<String, String> getBlazeVariableResponse(@RequestBody BlazeVariableCalculationRequest request) throws Exception {
        Map<String, String> response = new HashMap<>();

        if (checkFailure() || request == null) {
            throw new Exception();
        } else {
            response.put("id", "CODE12309");
            response.put("blazeVariableOne", "22310");
            response.put("blazeVariableTwo", "90081");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        return response;
    }


    @RequestMapping(value = "/blazeDecisionCalculate", method = RequestMethod.POST)
    public Map<String, String> getBlazeDecisionResponse(@RequestBody BlazeDecisionCalculationRequest request) throws Exception {
        Map<String, String> response = new HashMap<>();

        if (checkFailure() || request == null) {
            throw new Exception();
        } else {
            response.put("decision", "Approved");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        return response;
    }

    private Boolean checkFailure() {
        Random random = new Random();
        int value = random.nextInt(100);
        if (value % 11 == 0) {
            return true;
        }
        return false;
    }
}

