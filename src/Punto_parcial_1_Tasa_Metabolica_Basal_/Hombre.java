package Punto_parcial_1_Tasa_Metabolica_Basal_;

public class Hombre extends Tasa_Metabolica_Basal_ {
    
    public double tmb(double peso, double altura, int edad) {
        if (peso >= 60.0 && peso <= 110.0 && altura >= 160.0 && altura <= 195.0) {
    	double factorPeso = 13.397;
        double factorAltura = 4.799;
        double factorEdad = 5.677;
        double constante = 88.362;
        return calcularTMB(peso, altura, edad, factorPeso, factorAltura, factorEdad, constante);
    } else {
    	return 0.0; 
    }
}
}