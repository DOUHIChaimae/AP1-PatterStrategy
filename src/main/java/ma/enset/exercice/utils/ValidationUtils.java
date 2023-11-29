package ma.enset.exercice.utils;

public class ValidationUtils {
    public static void validateSalaireBrutMensuel(float salaireBrutMensuel) {
        if (salaireBrutMensuel <= 0) {
            throw new IllegalArgumentException("Le salaire brut mensuel doit être positif.");
        }
    }
}
