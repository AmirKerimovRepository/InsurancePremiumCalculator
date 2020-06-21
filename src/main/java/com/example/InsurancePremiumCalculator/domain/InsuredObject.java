package com.example.InsurancePremiumCalculator.domain;

import java.util.List;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "InsuredObject{" +
                "house='" + house + '\'' +
                ", subInsuredObjects=" + subInsuredObjects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsuredObject that = (InsuredObject) o;
        return Objects.equals(house, that.house) &&
                Objects.equals(subInsuredObjects, that.subInsuredObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(house, subInsuredObjects);
    }
}
