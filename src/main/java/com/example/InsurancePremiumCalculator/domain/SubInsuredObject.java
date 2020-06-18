package com.example.InsurancePremiumCalculator.domain;

import com.example.InsurancePremiumCalculator.validation.InsuranceRiskType;

public class SubInsuredObject {

    private String TV;
    private String microwave;
    private String blender;
    private String coffeeMaker;
    private String toaster;
    private double sumInsured;
    private InsuranceRiskType insuranceRiskType;

    public double getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(double sumInsured) {
        this.sumInsured = sumInsured;
    }

    public InsuranceRiskType getInsuranceRiskEnum() {
        return insuranceRiskType;
    }

    public void setInsuranceRiskEnum(InsuranceRiskType insuranceRiskType) {
        this.insuranceRiskType = insuranceRiskType;
    }

    public String getTV() {
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public String getMicrowave() {
        return microwave;
    }

    public void setMicrowave(String microwave) {
        this.microwave = microwave;
    }

    public String getBlender() {
        return blender;
    }

    public void setBlender(String blender) {
        this.blender = blender;
    }

    public String getCoffeeMaker() {
        return coffeeMaker;
    }

    public void setCoffeeMaker(String coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public String getToaster() {
        return toaster;
    }

    public void setToaster(String toaster) {
        this.toaster = toaster;
    }


}
