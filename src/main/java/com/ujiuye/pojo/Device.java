package com.ujiuye.pojo;

public class Device {

      private  String deviceID;
      private  String deviceType;
      private  String protocal;
      private String status;

    public Device(String deviceID, String deviceType, String protocal, String status) {
        this.deviceID = deviceID;
        this.deviceType = deviceType;
        this.protocal = protocal;
        this.status = status;
    }

    public Device() {
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceID='" + deviceID + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", protocal='" + protocal + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
