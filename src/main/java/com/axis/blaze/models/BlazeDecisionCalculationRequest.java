package com.axis.blaze.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlazeDecisionCalculationRequest {
    public String id = null;
    public String type = null;
    public Integer variableOne = null;
    public Integer variableTwo = null;

}
