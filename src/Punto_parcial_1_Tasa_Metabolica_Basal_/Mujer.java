package Punto_parcial_1_Tasa_Metabolica_Basal_;

public class Mujer extends Tasa_Metabolica_Basal_ {
    public double tmb(double peso, double altura, int edad) {
        if (peso >= 40.0 && peso <= 80.0 && altura >= 140.0 && altura <= 180.0) {
    	double factorPeso = 9.247;
        double factorAltura = 3.098;
        double factorEdad = 4.330;
        double constante = 447.593;    
        return calcularTMB(peso, altura, edad, factorPeso, factorAltura, factorEdad, constante);
    } else {
    	return 0.0;
    }
}
}