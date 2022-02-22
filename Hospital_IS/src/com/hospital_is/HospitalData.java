/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital_is;

/**
 *
 * @author abc
 */
public class HospitalData {
    private String hospitalName;
    private String address;
    private long telephoneNumber;
    private String hospitalCategory;
    private double admittedPrice;
    private String healthInsurence;

    public HospitalData(String hospitalName, String address, String telephoneNumber, 
            String hospitalCategory, String admittedPrice, String healthInsurence) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.telephoneNumber = Long.parseLong(telephoneNumber); 
        this.hospitalCategory = hospitalCategory;
        this.admittedPrice = Double.parseDouble(admittedPrice); 
        this.healthInsurence = healthInsurence;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getHospitalCategory() {
        return hospitalCategory;
    }

    public void setHospitalCategory(String hospitalCategory) {
        this.hospitalCategory = hospitalCategory;
    }

    public double getAdmittedPrice() {
        return admittedPrice;
    }

    public void setAdmittedPrice(double admittedPrice) {
        this.admittedPrice = admittedPrice;
    }

    public String getHealthInsurence() {
        return healthInsurence;
    }

    public void setHealthInsurence(String healthInsurence) {
        this.healthInsurence = healthInsurence;
    }

    @Override
    public String toString() {
        return "HospitalData{" + "hospitalName=" + hospitalName + ", address=" + address +
                ", telephoneNumber=" + telephoneNumber + ", hospitalCategory=" + hospitalCategory +
                ", admittedPrice=" + admittedPrice + ", healthInsurence=" + healthInsurence + '}';
    }
    
}
