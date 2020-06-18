package com.example.InsurancePremiumCalculator.domain;

import java.util.List;

public class InsuredObject {

    private String house;
    private String flat;
    private String garage;
    private String office;
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

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }


}
