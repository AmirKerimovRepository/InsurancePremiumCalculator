package com.example.InsurancePremiumCalculator.domain;

import java.util.List;
import java.util.Objects;

public class Policy {

    private String policyNumber;
    private PolicyStatus policyStatus;
    private List<InsuredObject> insuredObject;


    public Policy(String policyNumber, PolicyStatus policyStatus, List<InsuredObject> insuredObject) {
        this.policyNumber = policyNumber;
        this.policyStatus = policyStatus;
        this.insuredObject = insuredObject;
    }

    public Policy() {

    }

    public List<InsuredObject> getInsuredObject() {
        return insuredObject;
    }

    public void setInsuredObject(List<InsuredObject> insuredObject) {
        this.insuredObject = insuredObject;
    }


    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public PolicyStatus getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(PolicyStatus policyStatus) {
        this.policyStatus = policyStatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Objects.equals(policyNumber, policy.policyNumber) &&
                policyStatus == policy.policyStatus &&
                Objects.equals(insuredObject, policy.insuredObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber, policyStatus, insuredObject);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyStatus=" + policyStatus +
                ", insuredObject=" + insuredObject +
                '}';
    }
}
