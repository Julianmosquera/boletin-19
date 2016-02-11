package boletin19;

/**
 *
 * @author julian
 */
public class Correo {

   private String contido;
  private boolean leido;

    public Correo() {
    }

    public Correo(String contido, boolean leido) {
        this.contido = contido;
        this.leido = leido;
        
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    
   public boolean isLeido(){
        return leido;
    }
   
    public void correoleido() {
        if (leido == true) {
            System.out.println("Hay correo sin leer");
        }

    }

    @Override
    public String toString() {
        return "Correo{" + "contido=" + contido + ", leido=" + leido + '}';
    }
   
    
    
  
    
    

}