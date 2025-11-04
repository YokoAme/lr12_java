package org.example.task1;

public class Pet {
    protected String name;

    public Pet(String name) { this.name = name; }

    public String getName() { return name; }

    @Override
    public String toString(){
        return name;
    }
}
