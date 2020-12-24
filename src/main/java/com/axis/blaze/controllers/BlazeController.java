package com.axis.blaze.controllers;

import com.axis.blaze.exception.BlazeException;
import com.axis.blaze.response.BlazeVariableCalculationResponse;
import reactor.core.publisher.Mono;
import com.axis.blaze.response.BlazeDecisionCalculationResponse;
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
    public Mono<Object> getBlazeVariableResponse(@RequestBody String request) throws BlazeException {

        if (checkFailure() || request == null) {
            throw new BlazeException("Internal Server Error", "Internal Server Error during Blaze Variable Calculation");
        } else {
            try {
                Thread.sleep(5000);

                BlazeVariableCalculationResponse response = new BlazeVariableCalculationResponse("CODE12309", 1500, 6500);
                return Mono.just(response);
            } catch (InterruptedException e) {

            }
        }
        return Mono.empty();
    }

    @RequestMapping(value = "/blazeDecisionCalculate", method = RequestMethod.POST)
    public Mono<Object> getBlazeDecisionResponse(@RequestBody String request) throws BlazeException {

        if (checkFailure() || request == null) {
            throw new BlazeException("Internal Server Error", "Internal Server Error during Blaze Decision Calculation");
        } else {
            try {
                Thread.sleep(3000);
                BlazeDecisionCalculationResponse response = new BlazeDecisionCalculationResponse("Approved");
                return Mono.just(response);
            } catch (InterruptedException e) {

            }
        }
        return Mono.empty();
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

