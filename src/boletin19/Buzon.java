package boletin19;

import java.util.ArrayList;

/**
 *
 * @author julian
 */
public class Buzon {

    ArrayList<Correo> aCorreo = new ArrayList<Correo>();
    
    public void cargarArray(){
        Correo correo1=new Correo ("Primero",true);
        Correo correo2= new Correo("Segundo",false);
        Correo correo3= new Correo ("Tercero",true);
        Correo correo4=new Correo("Cuarto",false);
        
        
        aCorreo.add(correo1);
        aCorreo.add(correo2);
        aCorreo.add(correo3);
        aCorreo.add(correo4);
        
    }

    public Buzon() {
    }

    public int numeroDeCorreo() {
        int num = aCorreo.size();
        return num;
    }

    public void enGade(Correo c) {
        aCorreo.add(c);

    }

    public boolean porLer() {

        for (int i = 0; i < aCorreo.size(); i++) {
            if (aCorreo.get(i).isLeido() == false) {
                return false;
            }
        }
        return true;
    }

    public String amosaPrimerNoLeido() {
        String mens = "Todos los mensajes estan leidos";
        for (int i = 0; i < aCorreo.size(); i++) {
            if (aCorreo.get(i).isLeido() == false) {
                return aCorreo.get(i).getContido();
            }
        }
        return mens;
    }

    public String amosar(int j) {
        return aCorreo.get(j).getContido();
    }
    
    public void amosarTodo(){
        for (int i=0;i<aCorreo.size();i++){
            System.out.println(aCorreo.get(i));
            System.out.println("\n");
            
        }
    }

    public void eliminar(int j) {
        aCorreo.remove(j);
    }

}
