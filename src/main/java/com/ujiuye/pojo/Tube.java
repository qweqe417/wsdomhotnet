package com.ujiuye.pojo;

public class Tube {

       private  String tubeID;
       private  String tubeName;
       private  String tubeType;

    public Tube() {
    }

    public Tube(String tubeID, String tubeName, String tubeType) {
        this.tubeID = tubeID;
        this.tubeName = tubeName;
        this.tubeType = tubeType;
    }

    public String getTubeID() {
        return tubeID;
    }

    public void setTubeID(String tubeID) {
        this.tubeID = tubeID;
    }

    public String getTubeName() {
        return tubeName;
    }

    public void setTubeName(String tubeName) {
        this.tubeName = tubeName;
    }

    public String getTubeType() {
        return tubeType;
    }

    public void setTubeType(String tubeType) {
        this.tubeType = tubeType;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "tubeID='" + tubeID + '\'' +
                ", tubeName='" + tubeName + '\'' +
                ", tubeType='" + tubeType + '\'' +
                '}';
    }
}
