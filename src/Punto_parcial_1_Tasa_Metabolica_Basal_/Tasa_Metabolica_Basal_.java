package Punto_parcial_1_Tasa_Metabolica_Basal_;

public class Tasa_Metabolica_Basal_ {
    
    protected double calcularTMB(double peso, double altura, int edad, double factorPeso, double factorAltura, double factorEdad, double constante) {
        return constante + (factorPeso * peso) + (factorAltura * altura) - (factorEdad * edad);
    }
}