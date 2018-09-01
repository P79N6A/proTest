package com.didi.datainfra.jms.domain.entity;

import java.util.Date;

public class TaskDO {
    private Long id;

    private String code;

    private String name;

    private String userCode;

    private String demandSide;

    private String projectCode;

    private String taskType;

    private Byte taskPeriodType;

    private Byte priority;

    private String appPath;

    private String commonAppPath;

    private String mainClazz;

    private Integer processNo;

    private Integer cpuNo;

    private Integer memory;

    private Integer elapsedTime;

    private Integer inputTimeout;

    private Integer outputTimeout;

    private Integer outputOffset;

    private Integer beginTimeOffset;

    private Byte checkType;

    private Byte mode;

    private String yarnQueueName;

    private String hadoopAccount;

    private Byte retryTimes;

    private Byte onlyAlertOwner;

    private Byte useDefaultAlert;

    private Byte usePhoneAlert;

    private Byte useSmsAlert;

    private Byte useMailAlert;

    private String alertMails;

    private String alertPhones;

    private String alertSmsPhones;

    private Byte deleteFlag;

    private Date deleteTime;

    private Integer version;

    private Date createTime;

    private Date updateTime;

    private String productLine;

    private String dwLevel;

    private String tag;

    private Date modeTime;

    private String taskExeType;

    private Boolean cascade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getDemandSide() {
        return demandSide;
    }

    public void setDemandSide(String demandSide) {
        this.demandSide = demandSide;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public Byte getTaskPeriodType() {
        return taskPeriodType;
    }

    public void setTaskPeriodType(Byte taskPeriodType) {
        this.taskPeriodType = taskPeriodType;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public String getCommonAppPath() {
        return commonAppPath;
    }

    public void setCommonAppPath(String commonAppPath) {
        this.commonAppPath = commonAppPath;
    }

    public String getMainClazz() {
        return mainClazz;
    }

    public void setMainClazz(String mainClazz) {
        this.mainClazz = mainClazz;
    }

    public Integer getProcessNo() {
        return processNo;
    }

    public void setProcessNo(Integer processNo) {
        this.processNo = processNo;
    }

    public Integer getCpuNo() {
        return cpuNo;
    }

    public void setCpuNo(Integer cpuNo) {
        this.cpuNo = cpuNo;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getInputTimeout() {
        return inputTimeout;
    }

    public void setInputTimeout(Integer inputTimeout) {
        this.inputTimeout = inputTimeout;
    }

    public Integer getOutputTimeout() {
        return outputTimeout;
    }

    public void setOutputTimeout(Integer outputTimeout) {
        this.outputTimeout = outputTimeout;
    }

    public Integer getOutputOffset() {
        return outputOffset;
    }

    public void setOutputOffset(Integer outputOffset) {
        this.outputOffset = outputOffset;
    }

    public Integer getBeginTimeOffset() {
        return beginTimeOffset;
    }

    public void setBeginTimeOffset(Integer beginTimeOffset) {
        this.beginTimeOffset = beginTimeOffset;
    }

    public Byte getCheckType() {
        return checkType;
    }

    public void setCheckType(Byte checkType) {
        this.checkType = checkType;
    }

    public Byte getMode() {
        return mode;
    }

    public void setMode(Byte mode) {
        this.mode = mode;
    }

    public String getYarnQueueName() {
        return yarnQueueName;
    }

    public void setYarnQueueName(String yarnQueueName) {
        this.yarnQueueName = yarnQueueName;
    }

    public String getHadoopAccount() {
        return hadoopAccount;
    }

    public void setHadoopAccount(String hadoopAccount) {
        this.hadoopAccount = hadoopAccount;
    }

    public Byte getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Byte retryTimes) {
        this.retryTimes = retryTimes;
    }

    public Byte getOnlyAlertOwner() {
        return onlyAlertOwner;
    }

    public void setOnlyAlertOwner(Byte onlyAlertOwner) {
        this.onlyAlertOwner = onlyAlertOwner;
    }

    public Byte getUseDefaultAlert() {
        return useDefaultAlert;
    }

    public void setUseDefaultAlert(Byte useDefaultAlert) {
        this.useDefaultAlert = useDefaultAlert;
    }

    public Byte getUsePhoneAlert() {
        return usePhoneAlert;
    }

    public void setUsePhoneAlert(Byte usePhoneAlert) {
        this.usePhoneAlert = usePhoneAlert;
    }

    public Byte getUseSmsAlert() {
        return useSmsAlert;
    }

    public void setUseSmsAlert(Byte useSmsAlert) {
        this.useSmsAlert = useSmsAlert;
    }

    public Byte getUseMailAlert() {
        return useMailAlert;
    }

    public void setUseMailAlert(Byte useMailAlert) {
        this.useMailAlert = useMailAlert;
    }

    public String getAlertMails() {
        return alertMails;
    }

    public void setAlertMails(String alertMails) {
        this.alertMails = alertMails;
    }

    public String getAlertPhones() {
        return alertPhones;
    }

    public void setAlertPhones(String alertPhones) {
        this.alertPhones = alertPhones;
    }

    public String getAlertSmsPhones() {
        return alertSmsPhones;
    }

    public void setAlertSmsPhones(String alertSmsPhones) {
        this.alertSmsPhones = alertSmsPhones;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getDwLevel() {
        return dwLevel;
    }

    public void setDwLevel(String dwLevel) {
        this.dwLevel = dwLevel;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getModeTime() {
        return modeTime;
    }

    public void setModeTime(Date modeTime) {
        this.modeTime = modeTime;
    }

    public String getTaskExeType() {
        return taskExeType;
    }

    public void setTaskExeType(String taskExeType) {
        this.taskExeType = taskExeType;
    }

    public Boolean getCascade() {
        return cascade;
    }

    public void setCascade(Boolean cascade) {
        this.cascade = cascade;
    }
}