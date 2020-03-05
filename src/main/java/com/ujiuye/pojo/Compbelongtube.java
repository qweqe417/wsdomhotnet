package com.ujiuye.pojo;

public class Compbelongtube {

        private Long compID;
        private String tubeID;

    public Compbelongtube(Long compID, String tubeID) {
        this.compID = compID;
        this.tubeID = tubeID;
    }

    public Compbelongtube() {
    }

    public Long getCompID() {
        return compID;
    }

    public void setCompID(Long compID) {
        this.compID = compID;
    }

    public String getTubeID() {
        return tubeID;
    }

    public void setTubeID(String tubeID) {
        this.tubeID = tubeID;
    }

    @Override
    public String toString() {
        return "Compbelongtube{" +
                "compID=" + compID +
                ", tubeID=" + tubeID +
                '}';
    }
}
