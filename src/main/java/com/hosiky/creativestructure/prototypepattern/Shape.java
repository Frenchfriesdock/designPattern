package com.hosiky.creativestructure.prototypepattern;

abstract class Shape implements Cloneable {
    protected String type;

    public abstract void draw();

    public String getType() {
        return type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}