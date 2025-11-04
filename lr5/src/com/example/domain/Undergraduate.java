package com.example.domain;

public class Undergraduate extends Student {
    private String major;

    public Undergraduate(int id, String name, String major) {
        super(id, name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", специальность = '" + major + "'";
    }
}
