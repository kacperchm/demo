package com.example.demo.Kalkulatory;

public class Obliczenie {
    private float a;
    private float b;
    private Operation operacja;

    public Obliczenie(float a, float b, Operation operacja) {
        this.a = a;
        this.b = b;
        this.operacja = operacja;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public Operation getOperacja() {
        return operacja;
    }

    public void setOperacja(Operation operacja) {
        this.operacja = operacja;
    }
}
