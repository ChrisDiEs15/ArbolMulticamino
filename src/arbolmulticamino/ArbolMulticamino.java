/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolmulticamino;

/**
 *
 * @author Chris
 */
public class ArbolMulticamino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            PilaDinamica<Integer> pilaNumeros= new PilaDinamica<>();
            
            System.out.println("La pila esta vacia:"+pilaNumeros.isEmpty());
            
            pilaNumeros.push(5);
            pilaNumeros.push(10);
            pilaNumeros.push(15);
            pilaNumeros.push(20);
            pilaNumeros.push(25);
            
            System.out.println("El tamano es:"+pilaNumeros.size());
            System.out.println("El top es:"+pilaNumeros.top());
            
            int elemento = pilaNumeros.pop();
            System.out.println("se ha eliminado"+elemento);
            
            System.out.println(pilaNumeros);
            
                    
            
        
    }
    
}
