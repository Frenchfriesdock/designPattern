package com.hosiky.behavioralpatterns.iteratorpattern;

public class MyList implements Iterator{

    private String[] data;

    private int index;

    public MyList(String[] data) {
        this.data = data;
        index = 0;
    }

    public boolean hasNext() {
        return index < data.length;
    }

    public Object next() {
        if(hasNext()){
            return data[index++];
        }
        return null;
    }
}
