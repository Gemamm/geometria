
package com.ceep.dominio;


public class Circulo extends FiguraGeometrica{
    
    public Circulo(String tipoFigura){
        super(tipoFigura);
        
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime por pantalla un: " + this.getClass().getSimpleName());
        
    }
    
}
