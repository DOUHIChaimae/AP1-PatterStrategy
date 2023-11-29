package ma.enset.exercice;


import ma.enset.exercice.entities.Employe;
import ma.enset.exercice.services.IGRCalculator;
import ma.enset.exercice.services.impl.IGRMarocCalculator;

public class Test {
    public static void main(String[] args) {
        IGRCalculator igrMarocCalculator = new IGRMarocCalculator();
        Employe employe = new Employe("emp1", 10000);
        employe.setIgrCalculator(igrMarocCalculator);
        float igr = employe.calculerIGR();
        System.out.println(igr);
        System.out.println(employe.calculateSalaireNetMensuel(employe.getSalaireBrutMensuel(), igr));
    }
}