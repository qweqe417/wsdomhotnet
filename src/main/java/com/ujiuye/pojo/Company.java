package com.ujiuye.pojo;

public class Company {

        private  Long compID;
        private  String compName;
        private  String contactPerson;
        private  String contactInfo;

    public Company(Long compID, String compName, String contactPerson, String contactInfo) {
        this.compID = compID;
        this.compName = compName;
        this.contactPerson = contactPerson;
        this.contactInfo = contactInfo;
    }

    public Long getCompID() {
        return compID;
    }

    public void setCompID(Long compID) {
        this.compID = compID;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Company{" +
                "compID=" + compID +
                ", compName='" + compName + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
