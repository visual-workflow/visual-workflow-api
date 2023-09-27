package com.kgignatyev.temporal.visualwf.api;

import java.util.List;

public class WFInfo {

    /**
     * Some runtime information about the workflow.
     */
    public String legend;

    /***
     * Could be more than one if the workflow is in a parallel state.
     */
    public List<WFStateInfo> activeStates;

    public WFInfo setLegend(String legend) {
        this.legend = legend;
        return this;
    }

    public WFInfo setActiveStates(List<WFStateInfo> activeStates) {
        this.activeStates = activeStates;
        return this;
    }
}
