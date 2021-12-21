/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecartesiano;

/**
 *
 * @author albertogarzon
 */
/*
6. Define una clase Linea con dos atributos de la clase PuntoGeométrico: puntoA y puntoB. 
Estos puntos representarán el inicio y el fin de la línea en un plano. 
La clase dispondrá de los siguientes métodos:

Linea() - Constructor por defecto
Constructor predeterminado que crea una línea con sus dos puntos como (0,0) y (1,1).

Linea(Punto A, Punto B) - Constructor parametrizado
Constructor que recibe como parámetros dos objetos de la clase PuntoGeométrico, 
que son utilizados para inicializar los atributos.

mueveDerecha(double x)
Desplaza la línea a la derecha a la distancia que se indique.

mueveIzquierda(double x)
Desplaza la línea a la izquierda a la distancia que se indique.

mueveArriba(double y)
Desplaza la línea hacia arriba a la distancia que se indique.

mueveAbajo(double y)
Desplaza la línea hacia abajo a la distancia que se indique.

Métodos get y set.

MostrarLinea()
Permite mostrar información de la línea de la siguiente forma:
[(puntoA),(puntoB)]. Por ejemplo: [(1.2),(1.5) , (2.2),(2.5)].

 */
public class Linea {

    private PuntoGeometrico puntoA;
    private PuntoGeometrico puntoB;

    public Linea() {

        this.puntoA = new PuntoGeometrico(0, 0);
        this.puntoB = new PuntoGeometrico(1, 1);
    }

    public Linea(PuntoGeometrico puntoA, PuntoGeometrico puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public void mueveDerecha(double x) {

        this.puntoA.setX(this.puntoA.getX() + x);
        this.puntoB.setX(this.puntoB.getX() + x);

    }

    public void mueveIzquierda(double x) {

        this.puntoA.setX(this.puntoA.getX() - x);
        this.puntoB.setX(this.puntoB.getX() - x);

    }

    public void mueveArriba(double x) {

        this.puntoA.setY(this.puntoA.getY() + x);
        this.puntoB.setY(this.puntoB.getY() + x);

    }

    public void mueveAbajo(double x) {

        this.puntoA.setY(this.puntoA.getY() - x);
        this.puntoB.setY(this.puntoB.getY() - x);
    }

 
   public void mostrarLinea() {

        System.out.println("[(" + this.puntoA.getX() + this.puntoA.getY() +")" + 
                "," + "(" + this.puntoB.getX() + this.puntoB.getY() +")]");
    }

    public PuntoGeometrico getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(PuntoGeometrico puntoA) {
        this.puntoA = puntoA;
    }

    public PuntoGeometrico getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(PuntoGeometrico puntoB) {
        this.puntoB = puntoB;
    }

    @Override
    public String toString() {
        return "Linea{" + "puntoA=" + puntoA + ", puntoB=" + puntoB + '}';
    }

    
}
