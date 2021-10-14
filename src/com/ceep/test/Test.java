
package com.ceep.test;
import com.ceep.dominio.*;


public class Test {

    
    public static void main(String[] args) {
        
        FiguraGeometrica figura = new Rectangulo ("Rectangulo");
        figura.dibujar();
        
        FiguraGeometrica figura2 = new Circulo ("Circulo");
        figura2.dibujar();
        
        FiguraGeometrica figura3 = new Triangulo ("Triangulo");
        figura3.dibujar();
    
}
}