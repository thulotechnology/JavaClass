package com.company;

public class EncapsulationWork {
    public static void main(String[] args) {
    Bag b = new Bag();
   b.setName("Allo Bag");
   b.setColor("Red");

        System.out.println(b.getName());
    }
}
class Bag{
   private String name;
   private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
