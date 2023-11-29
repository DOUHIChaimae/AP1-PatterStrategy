package ma.enset.exercice.services.impl;


import ma.enset.exercice.services.IGRCalculator;

public class IGRAlgerieCalculator implements IGRCalculator {

    @Override
    public float calculateIGR(float salaireBrutAnuel) {
        return salaireBrutAnuel * 0.35f;
    }
}
