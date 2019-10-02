package com.sematec.sematecandroidadvancedmehr98;

public class PersonNameModel {

    PersonNameModel(String name, String family) {
        setName(name);
        setFamily(family);
    }

    private String name;
    private String family;

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
}
