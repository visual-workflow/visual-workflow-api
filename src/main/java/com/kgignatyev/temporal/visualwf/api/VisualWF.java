package com.kgignatyev.temporal.visualwf.api;


import io.temporal.workflow.QueryMethod;

public interface VisualWF {

    /**
     * Returns the PlantUML definition of the workflow.
     * <a href="https://plantuml.com/state-diagram">State Diagram</a>
     *
     */
    @QueryMethod
    String getPlantUMLWorkflowDefinition();

    @QueryMethod
    WFInfo getWorkflowInfo();


}
