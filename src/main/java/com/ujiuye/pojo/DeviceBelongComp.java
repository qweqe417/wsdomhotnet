package com.ujiuye.pojo;

public class DeviceBelongComp {

         private String deviceID;
         private Long compID;

    public DeviceBelongComp() {
    }

    public DeviceBelongComp(String deviceID, Long compID) {
        this.deviceID = deviceID;
        this.compID = compID;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public Long getCompID() {
        return compID;
    }

    public void setCompID(Long compID) {
        this.compID = compID;
    }

    @Override
    public String toString() {
        return "DeviceBelongComp{" +
                "deviceID='" + deviceID + '\'' +
                ", compID=" + compID +
                '}';
    }
}
