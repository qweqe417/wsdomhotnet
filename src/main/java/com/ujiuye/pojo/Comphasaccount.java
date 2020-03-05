package com.ujiuye.pojo;

public class Comphasaccount {

    private  String userName;
    private  Long compID;

    public Comphasaccount(String userName, Long compID) {
        this.userName = userName;
        this.compID = compID;
    }

    public Comphasaccount() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getCompID() {
        return compID;
    }

    public void setCompID(Long compID) {
        this.compID = compID;
    }

    @Override
    public String toString() {
        return "Comphasaccount{" +
                "userName='" + userName + '\'' +
                ", compID=" + compID +
                '}';
    }
}
