package com.people;

public class Woman extends Person {
    private String maidenName;

    public Woman(String firstName, String lastName, int age, String maidenName) {
        super(firstName, lastName, age);
        this.maidenName = maidenName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    @Override
    public boolean isRetired() {
        return getAge() >= 60;
    }

    public void registerPartnership(Man partner) {
        setPartner(partner);
        setLastName(partner.getLastName());
        System.out.println("She got married to " + partner.getLastName());
    }

    public void deregisterPartnership(boolean divorce) {
        setPartner(null);
        if (divorce) {
            setLastName(maidenName);
            System.out.println("After divorce she became " + maidenName);
        }
    }
}
