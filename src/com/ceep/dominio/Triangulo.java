
package com.ceep.dominio;


public class Triangulo extends FiguraGeometrica{
    
    public Triangulo(String tipoFigura){
        super(tipoFigura);
        
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime por pantalla un: " + this.getClass().getSimpleName());
        
    }
    
}
