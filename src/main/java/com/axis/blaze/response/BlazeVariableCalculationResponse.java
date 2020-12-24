package com.axis.blaze.response;

public class BlazeVariableCalculationResponse {
    public String id = null;
    public Integer blazeVariableOne;
    public Integer blazeVariableTwo;

    public BlazeVariableCalculationResponse(String id, Integer blazeVariableOne, Integer blazeVariableTwo) {
        this.id = id;
        this.blazeVariableOne = blazeVariableOne;
        this.blazeVariableTwo = blazeVariableTwo;
    }
}
