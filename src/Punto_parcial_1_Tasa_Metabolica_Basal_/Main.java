package Punto_parcial_1_Tasa_Metabolica_Basal_;

public class Main {
    public static void main(String[] args) {
        double pesoHombreValido = 80.0;
        double alturaHombreValido = 180.0;
        int edadHombreValido = 30;
        Hombre hombreValido = new Hombre();
        double tmbHombreValido = hombreValido.tmb(pesoHombreValido, alturaHombreValido, edadHombreValido);

        System.out.println(tmbHombreValido);

        double pesoHombreInvalido = 55.0;
        double alturaHombreInvalido = 170.0;
        int edadHombreInvalido = 28;
        Hombre hombreInvalido = new Hombre();
        double tmbHombreInvalido = hombreInvalido.tmb(pesoHombreInvalido, alturaHombreInvalido, edadHombreInvalido);
        
        System.out.println(tmbHombreInvalido);
        
        double pesoMujerValido = 60.0;
        double alturaMujerValido = 165.0;
        int edadMujerValido = 25;
        Mujer mujerValida = new Mujer();
        double tmbMujerValida = mujerValida.tmb(pesoMujerValido, alturaMujerValido, edadMujerValido);
        
        System.out.println(tmbMujerValida);
        
        double pesoMujerInvalido = 70.0;
        double alturaMujerInvalida = 185.0; 
        int edadMujerInvalida = 35;
        Mujer mujerInvalida = new Mujer();
        double tmbMujerInvalida = mujerInvalida.tmb(pesoMujerInvalido, alturaMujerInvalida, edadMujerInvalida);
        
        System.out.println( tmbMujerInvalida );
    }
}