package com.samoylenko;

public class Fruit {
    public enum Type {
        APPLE, BANANA, LEMON
    }

    private Type type;
    private int weight;
    private double pricePerKg;


    public Fruit(Type type, int weight, double pricePerKg) {
        this.type = type;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public Type getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "type=" + type +
                ", weight=" + weight +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}