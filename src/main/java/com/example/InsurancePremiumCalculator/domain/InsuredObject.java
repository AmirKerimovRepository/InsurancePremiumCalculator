package com.example.InsurancePremiumCalculator.domain;

import java.util.List;
import java.util.Objects;

public class InsuredObject {

    private String property;
    private List<SubInsuredObject> subInsuredObjects;

    public InsuredObject(String property, List<SubInsuredObject> subInsuredObjects) {
        this.property = property;
        this.subInsuredObjects = subInsuredObjects;
    }

    public InsuredObject() {
    }

    public List<SubInsuredObject> getSubInsuredObjects() {
        return subInsuredObjects;
    }

    public void setSubInsuredObjects(List<SubInsuredObject> subInsuredObjects) {
        this.subInsuredObjects = subInsuredObjects;
    }

    public String getHouse() {
        return property;
    }

    public void setHouse(String house) {
        this.property = house;
    }

    @Override
    public String toString() {
        return "InsuredObject{" +
                "house='" + property + '\'' +
                ", subInsuredObjects=" + subInsuredObjects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsuredObject that = (InsuredObject) o;
        return Objects.equals(property, that.property) &&
                Objects.equals(subInsuredObjects, that.subInsuredObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(property, subInsuredObjects);
    }
}
