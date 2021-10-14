
package com.ceep.dominio;


public abstract class FiguraGeometrica {
    private String tipoFijura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFijura = tipoFigura;
        
    }
    
    public abstract void dibujar();

    public String getTipoFijura() {
        return tipoFijura;
    }

    public void setTipoFijura(String tipoFijura) {
        this.tipoFijura = tipoFijura;
    }
        
    
    
}
