package com.example.InsurancePremiumCalculator.domain;

import java.util.List;

public class InsuredObject {

    private String house;
    private List<SubInsuredObject> subInsuredObjects;

    public List<SubInsuredObject> getSubInsuredObjects() {
        return subInsuredObjects;
    }

    public void setSubInsuredObjects(List<SubInsuredObject> subInsuredObjects) {
        this.subInsuredObjects = subInsuredObjects;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }


}
