/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puebascanner;

/**
 *
 * @author Angel
 */
public class Service{
    Producto producto = new Producto();
    
    public void MostrarProducto(){
        
        System.out.println("El nombre es: " +producto.getNombre());
    }
    
    public void EnviarNombre(String nombre){
        
        producto.setNombre(nombre);
    }
}
