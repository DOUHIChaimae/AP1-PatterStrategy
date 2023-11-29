package ma.enset.exercice.services.impl;


import ma.enset.exercice.services.IGRCalculator;

public class IGRMarocCalculator implements IGRCalculator {
    @Override
    public float calculateIGR(float salaireBrutAnuel) {
        if (salaireBrutAnuel < 40000) {
            return salaireBrutAnuel * 0.05f;
        } else if (salaireBrutAnuel < 120000) {
            return salaireBrutAnuel * 0.20f;
        } else {
            return salaireBrutAnuel * 0.42f;
        }
    }
}
