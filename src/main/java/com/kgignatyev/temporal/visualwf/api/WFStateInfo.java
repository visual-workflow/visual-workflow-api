package com.kgignatyev.temporal.visualwf.api;

public class WFStateInfo {
    public String stateName;
    public Boolean isError;
    public String comment;

    public WFStateInfo setStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public WFStateInfo setError(Boolean error) {
        isError = error;
        return this;
    }

    public WFStateInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
