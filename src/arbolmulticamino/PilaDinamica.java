package arbolmulticamino;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Chris
 */
public class PilaDinamica<T> {

    private Nodo<T> top;
    private int tamano;

    public PilaDinamica() {
        top = null;
        this.tamano = 0;

    }

    public boolean isEmpty() {
        return top == null;
    }

    ;
  
  public int size() {
        return this.tamano;
    }

    ;
  
  public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getElemento();
        }
    }

    ;
    
  public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T elemento = top.getElemento();
            Nodo<T> aux = top.getSiguiente();
            top = null;
            top = aux;
            return elemento;
        }
    }

    public void push(T elemento) {
        Nodo<T> aux = new Nodo<>(elemento, top);
        top = aux;
        this.tamano++;
    }

    public String toString() {
        if (isEmpty()) {
            return "la pila esta vacia";
        } else {
            String resultado = "";
            Nodo<T> aux = top;
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
            return resultado;
        }
    }
}
