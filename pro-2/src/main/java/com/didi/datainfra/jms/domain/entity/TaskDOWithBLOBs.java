package com.didi.datainfra.jms.domain.entity;

public class TaskDOWithBLOBs extends TaskDO {
    private String inputPaths;

    private String outputPaths;

    private String remark;

    public String getInputPaths() {
        return inputPaths;
    }

    public void setInputPaths(String inputPaths) {
        this.inputPaths = inputPaths;
    }

    public String getOutputPaths() {
        return outputPaths;
    }

    public void setOutputPaths(String outputPaths) {
        this.outputPaths = outputPaths;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}