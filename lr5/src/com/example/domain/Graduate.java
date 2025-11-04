package com.example.domain;

public class Graduate extends Student {
    private String researchTopic;

    public Graduate(int id, String name, String researchTopic) {
        super(id, name);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String toString() {
        return super.toString() + ", тема исследования = '" + researchTopic + "'";
    }
}
