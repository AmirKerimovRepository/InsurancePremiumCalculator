package com.example.InsurancePremiumCalculator.domain;

import java.util.Objects;

public class Policy {

    private String policyNumber;
    private PolicyStatus policyStatus;
    private double sumInsuredFire;
    private double sumInsuredTheft;
    private InsuredObject insuredObject;

    public Policy(String policyNumber, PolicyStatus policyStatus, double sumInsuredFire , double sumInsuredTheft, InsuredObject insuredObject) {
        this.policyNumber = policyNumber;
        this.policyStatus = policyStatus;
        this.sumInsuredFire = sumInsuredFire;
        this.sumInsuredTheft = sumInsuredTheft;
        this.insuredObject = insuredObject;
    }

    public InsuredObject getInsuredObject() {
        return insuredObject;
    }

    public void setInsuredObject(InsuredObject insuredObject) {
        this.insuredObject = insuredObject;
    }

    public double getSumInsuredFire() {
        return sumInsuredFire;
    }

    public void setSumInsuredFire(double sumInsuredFire) {
        this.sumInsuredFire = sumInsuredFire;
    }

    public double getSumInsuredTheft() {
        return sumInsuredTheft;
    }

    public void setSumInsuredTheft(double sumInsuredTheft) {
        this.sumInsuredTheft = sumInsuredTheft;
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
        return policyNumber.equals(policy.policyNumber) &&
                policyStatus == policy.policyStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber, policyStatus);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyStatus=" + policyStatus +
                '}';
    }

}
