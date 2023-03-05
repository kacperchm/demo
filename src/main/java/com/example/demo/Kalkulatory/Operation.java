package com.example.demo.Kalkulatory;

public enum Operation {
    DODAJ{
        @Override
        public float oblicz(float a, float b) {
            return a + b;
        }
    },
    ODEJMIJ{
        @Override
        public float oblicz(float a, float b) {
            return a - b;
        }
    },
    PODZIEL{
        @Override
        public float oblicz(float a, float b) {
            return a/b;
        }
    },
    POMNOZ{
        @Override
        public float oblicz(float a, float b) {
            return a*b;
        }
    },
    POTEGUJ {
        @Override
        public float oblicz(float a, float b) {
            return (float) Math.pow(a,b);
        }
    };

    public abstract float oblicz(float a, float b);
}
