/*
 * Composite : sirve para representar jerarquias de objetos y sobre todo
 * cuando necesitamos usarlos en forma de arbol.
 * 
 * La cosa está en que los hijos han de tener LA MISMA INTERFAZ que el padre.
 */

package patrones.estructurales.decorator;


import java.util.ArrayList;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class Componente implements Htmlable{
    
    protected String sttag, endtag;
    protected ArrayList<Htmlable> componentes;
    
    public Componente(){
        componentes = new ArrayList<Htmlable>();
        sttag = "";
        endtag = "";
    }

    @Override
    public String toHtml() {
        String cadena = sttag;
        for(Htmlable c: componentes)
            cadena += c.toHtml();
        return cadena + endtag;
        
    }
    
    protected Componente push(Componente c){
        componentes.add(c);
        return this;
    }
    

}
