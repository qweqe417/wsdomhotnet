package com.ujiuye.pojo;

public class Record {

     private  Long recordID;
     private  float remainMoney;
     private float pressure;
     private  float temp;
     private float instStream;
     private float accuStream;
     private float frequency;
     private float density;
     private  Integer shutTimes;
     private  Integer  shutDur;

    public Record() {
    }

    public Record(Long recordID, float remainMoney, float pressure, float temp, float instStream, float accuStream, float frequency, float density, Integer shutTimes, Integer shutDur) {
        this.recordID = recordID;
        this.remainMoney = remainMoney;
        this.pressure = pressure;
        this.temp = temp;
        this.instStream = instStream;
        this.accuStream = accuStream;
        this.frequency = frequency;
        this.density = density;
        this.shutTimes = shutTimes;
        this.shutDur = shutDur;
    }

    public Long getRecordID() {
        return recordID;
    }

    public void setRecordID(Long recordID) {
        this.recordID = recordID;
    }

    public float getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(float remainMoney) {
        this.remainMoney = remainMoney;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getInstStream() {
        return instStream;
    }

    public void setInstStream(float instStream) {
        this.instStream = instStream;
    }

    public float getAccuStream() {
        return accuStream;
    }

    public void setAccuStream(float accuStream) {
        this.accuStream = accuStream;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public Integer getShutTimes() {
        return shutTimes;
    }

    public void setShutTimes(Integer shutTimes) {
        this.shutTimes = shutTimes;
    }

    public Integer getShutDur() {
        return shutDur;
    }

    public void setShutDur(Integer shutDur) {
        this.shutDur = shutDur;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordID=" + recordID +
                ", remainMoney=" + remainMoney +
                ", pressure=" + pressure +
                ", temp=" + temp +
                ", instStream=" + instStream +
                ", accuStream=" + accuStream +
                ", frequency=" + frequency +
                ", density=" + density +
                ", shutTimes=" + shutTimes +
                ", shutDur=" + shutDur +
                '}';
    }
}
