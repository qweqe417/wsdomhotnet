package com.ujiuye.pojo;

import java.util.Date;

/**
 * 小时表
 */
public class Hour {

    private Long recording; //记录Id
    private float balance;//剩余金额
    private  float pressure; //压力
    private float temperature ; //温度
    private  float Instantaneous_flow; //瞬时流量
    private  float frequency; //频率
    private  float  Cumulative_traffic; //累计流量
    private  float density; //密度
    private float Dryness; //干度
    private  Long  Power_off_times; //断电次数
    private  Long Power_off_time ;//断电时长
    private  String Meter_factor; //仪表系数
    private  String Pipeline_name; //管线名
    private   Long  Power_status ;//供电状态
    private  Long Valve_status; //阀门状态
    private Date Acquisition_time; //采集  时间
    private  Long device; //设备id

    public Hour() {
    }

    public Hour(Long recording, float balance, float pressure, float temperature, float instantaneous_flow, float frequency, float cumulative_traffic, float density, float dryness, Long power_off_times, Long power_off_time, String meter_factor, String pipeline_name, Long power_status, Long valve_status, Date acquisition_time, Long device) {
        this.recording = recording;
        this.balance = balance;
        this.pressure = pressure;
        this.temperature = temperature;
        Instantaneous_flow = instantaneous_flow;
        this.frequency = frequency;
        Cumulative_traffic = cumulative_traffic;
        this.density = density;
        Dryness = dryness;
        Power_off_times = power_off_times;
        Power_off_time = power_off_time;
        Meter_factor = meter_factor;
        Pipeline_name = pipeline_name;
        Power_status = power_status;
        Valve_status = valve_status;
        Acquisition_time = acquisition_time;
        this.device = device;
    }

    public Long getRecording() {
        return recording;
    }

    public void setRecording(Long recording) {
        this.recording = recording;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getInstantaneous_flow() {
        return Instantaneous_flow;
    }

    public void setInstantaneous_flow(float instantaneous_flow) {
        Instantaneous_flow = instantaneous_flow;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public float getCumulative_traffic() {
        return Cumulative_traffic;
    }

    public void setCumulative_traffic(float cumulative_traffic) {
        Cumulative_traffic = cumulative_traffic;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public float getDryness() {
        return Dryness;
    }

    public void setDryness(float dryness) {
        Dryness = dryness;
    }

    public Long getPower_off_times() {
        return Power_off_times;
    }

    public void setPower_off_times(Long power_off_times) {
        Power_off_times = power_off_times;
    }

    public Long getPower_off_time() {
        return Power_off_time;
    }

    public void setPower_off_time(Long power_off_time) {
        Power_off_time = power_off_time;
    }

    public String getMeter_factor() {
        return Meter_factor;
    }

    public void setMeter_factor(String meter_factor) {
        Meter_factor = meter_factor;
    }

    public String getPipeline_name() {
        return Pipeline_name;
    }

    public void setPipeline_name(String pipeline_name) {
        Pipeline_name = pipeline_name;
    }

    public Long getPower_status() {
        return Power_status;
    }

    public void setPower_status(Long power_status) {
        Power_status = power_status;
    }

    public Long getValve_status() {
        return Valve_status;
    }

    public void setValve_status(Long valve_status) {
        Valve_status = valve_status;
    }

    public Date getAcquisition_time() {
        return Acquisition_time;
    }

    public void setAcquisition_time(Date acquisition_time) {
        Acquisition_time = acquisition_time;
    }

    public Long getDevice() {
        return device;
    }

    public void setDevice(Long device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "Hour{" +
                "recording=" + recording +
                ", balance=" + balance +
                ", pressure=" + pressure +
                ", temperature=" + temperature +
                ", Instantaneous_flow=" + Instantaneous_flow +
                ", frequency=" + frequency +
                ", Cumulative_traffic=" + Cumulative_traffic +
                ", density=" + density +
                ", Dryness=" + Dryness +
                ", Power_off_times=" + Power_off_times +
                ", Power_off_time=" + Power_off_time +
                ", Meter_factor='" + Meter_factor + '\'' +
                ", Pipeline_name='" + Pipeline_name + '\'' +
                ", Power_status=" + Power_status +
                ", Valve_status=" + Valve_status +
                ", Acquisition_time=" + Acquisition_time +
                ", device=" + device +
                '}';
    }
}
