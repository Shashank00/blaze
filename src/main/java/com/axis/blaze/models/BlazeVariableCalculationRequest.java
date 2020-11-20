package com.axis.blaze.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlazeVariableCalculationRequest {
    public String id = null;
    public String type = null;
}
