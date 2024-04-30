/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolmulticamino;

/**
 *
 * @author Chris
 */
public class ColaDinamica<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamano;

    public ColaDinamica() {
        primero = null;
        ultimo = null;
        tamano = 0;

    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return tamano;
    }

    public T primero() {
        if (isEmpty()) {
            return null;
        }
        return primero.getElemento();
    }

    public T enqueue(T elemento) {

        Nodo<T> aux = new Nodo(elemento, null);
        if (isEmpty()) {
            primero = aux;
            ultimo = aux;
        } else {
            if (size() == 1) {
                ultimo = aux;
                primero.setSiguiente(ultimo);
            } else {
                ultimo.setSiguiente(aux);

            }
            ultimo = aux;
        }
        tamano++;
        return aux.getElemento();
    }

    public T dequeve() {
        if (isEmpty()) {
            return null;
        }
        T elemento = primero.getElemento();
        Nodo<T> aux = primero.getSiguiente();
        primero = null;
        primero = aux;
        tamano--;
        if (isEmpty()) {
            ultimo = null;
        }
        return elemento;
    }

    public String toString() {
        if (isEmpty()) {
            return "La lista esta vacia";
        } else {
            String cadena = "";
            Nodo<T> aux = primero;

            while (aux != null) {
                cadena += aux;
                aux = aux.getSiguiente();
            }
            return cadena;
        }
        
    }
}
