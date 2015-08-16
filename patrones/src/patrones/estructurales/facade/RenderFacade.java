/*
 * El patron Facade sirve para combinar subsistemas.
 * Su principal cometido es proporcionar una interfaz uniforme para todos los
 * subsistemas.
 * Es una de las mas importantes por el grado de repeticion.
 * 
 * Entre las principales ventajas estan : 
 * - Reducir la comunicación entre las clases (reducir acoplamiento)
 * - aumenta la cohesión
 */

package patrones.estructurales.facade;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class RenderFacade {
    
    private D3dRender d3d;
    private OpenGLRender opengl;
    private SoundSystem sound;
    
    public RenderFacade(){
        /*
        * TODO : constructor
        */
    }
    
    public void draw(float[] vec){
        if (d3d == null)
            opengl.drawPoint(vec);
        else
            d3d.draw(vec);
        
    }
    
    public void playSound(String fname){
        sound.reproduceSound("");
    }

}
