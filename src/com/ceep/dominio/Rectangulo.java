
package com.ceep.dominio;


public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoFigura){
        super(tipoFigura);
        
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime por pantalla un: " + this.getClass().getSimpleName());
        
    }
}
