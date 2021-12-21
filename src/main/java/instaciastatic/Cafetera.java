/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instaciastatic;

/**
 *
 * @author albertogarzon
 */
/*

8.  Desarrolla una clase Cafetera con atributos capacidadMaxima (la cantidad máxima de 
café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que 
hay dentro de la cafetera). Implementa, al menos, los siguientes métodos:

1 - Constructor predeterminado, sin parámetros: establece la capacidad máxima en 1000 (c.c.) 
y la cantidad actual en cero (cafetera vacía).

2 - Constructor, que recibe sólo la capacidad máxima de la cafetera; inicializa la cantidad 
actual de café igual a la capacidad máxima (cafetera llena).

3 - Constructor, que recibe la capacidad máxima y la cantidad actual. 
Si la cantidad actual que se pasa es mayor que la capacidad máxima de la cafetera, 
se ajustará la cantidad actual a la capacidad máxima.

4 - llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.

5 - servirTaza(double cantidadAServir): simula la acción de servir una taza con 
la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
se sirve lo que quede.

6 - vaciarCafetera(): pone la cantidad de café actual en cero.

7 - agregarCafe(double cantidadAgregar): añade a la cafetera la cantidad de café indicada, 
teniendo en cuenta que la cafetera no puede rebosar.

 */
public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;
    
    //No se puede usar el puntero this con static, siempre que el nombre este
    //en cursiva es estatico
    //Atributo de clase
    private  static int contador;
    
    public static final String FABRICANTE = "Nesspresso";

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        contador++;
    }

    public Cafetera(double capacidadMaxima) {
        //Si la capacidadMax es negativa pasa a positiva, utilizando Math.abs es mas
        //util que usar un if
        this.capacidadMaxima = Math.abs(capacidadMaxima);
        this.cantidadActual = capacidadMaxima;
        contador++;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        /*
        Se pueden inicializar los atributos al principio del constructor y poder usar
        el puntero this. en todos las condiciones y setencias
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
         
        //Ejemplo de if, se podria usar Math.abs para ahorrar codigo
        if (cantidadActual < 0 || capacidadMaxima < 0) {
            this.capacidadMaxima = 0;
            this.cantidadActual = 0;
        }
         */
        this.capacidadMaxima = Math.abs(capacidadMaxima);
        this.cantidadActual = Math.abs(cantidadActual);

        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
        }
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirTaza(double cantidadAServir) {

        double cantidadPositiva = Math.abs(cantidadAServir);

        if (cantidadPositiva > this.cantidadActual) {

            this.cantidadActual = 0;
        }

        this.cantidadActual -= cantidadPositiva;
    }

    public void vaciarCafetera() {

        this.cantidadActual = 0;
    }

    public void agregarCafe(double cantidadAgregar) {

        double cantidadAgregada = Math.abs(cantidadAgregar);
        double cantidadRestante;

        cantidadRestante = this.capacidadMaxima - this.cantidadActual;

        if (this.cantidadActual > cantidadRestante) {
            throw new IllegalArgumentException("La cafetera esta rebosando");
        }

        this.cantidadActual += cantidadAgregada;

    }

   //No se podria usar en el main de otra clase al ser static
   public static int getContadores() {
        return contador;
    }
    
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = Math.abs(capacidadMaxima);
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = Math.abs(cantidadActual);
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

}
