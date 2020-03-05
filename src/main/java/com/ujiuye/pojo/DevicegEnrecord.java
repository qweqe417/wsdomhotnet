package com.ujiuye.pojo;

public class DevicegEnrecord {

      private  String deviceID;
      private  Long recordID;

    public DevicegEnrecord(String deviceID, Long recordID) {
        this.deviceID = deviceID;
        this.recordID = recordID;
    }

    public DevicegEnrecord() {
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public Long getRecordID() {
        return recordID;
    }

    public void setRecordID(Long recordID) {
        this.recordID = recordID;
    }

    @Override
    public String toString() {
        return "DevicegEnrecord{" +
                "deviceID='" + deviceID + '\'' +
                ", recordID=" + recordID +
                '}';
    }
}
