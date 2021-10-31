package com.company;

import java.util.ArrayList;

public class Box <E extends Fruit>{

    ArrayList<E> boxes;

    public Box(){
        boxes = new ArrayList<>();
    }
    public double getWeight(){
        float result = 0;
        for (int i = 0; i < boxes.size(); i++) {
            result += boxes.get(i).weight;
        }
        return result;
    }

    public void add(E fruit){boxes.add(fruit);
    }

    public boolean Compare(Box<?> anotherBox){
        if (this.getWeight() == anotherBox.getWeight()){
            return true;
        }
        else return false;
    }
}