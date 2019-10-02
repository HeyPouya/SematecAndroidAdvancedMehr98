package com.sematec.sematecandroidadvancedmehr98;

import androidx.annotation.NonNull;

public class Person {
    private String name;
    private String family;
    private String fatherName;
    private String nationalCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    @NonNull
    @Override
    public String toString() {
        return "Name is : " + getName() + "\n" +
                "Family is : " + getFamily();
    }
}
