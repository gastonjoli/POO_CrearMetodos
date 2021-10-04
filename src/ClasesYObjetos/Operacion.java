package ClasesYObjetos;

import javax.swing.*;

public class Operacion {

    //Atributos

    int num1;
    int num2;
    int suma;
    int resta;
    int mult;
    int div;

    //Métodos


    //Metodo para pedir a usuario que dijite 2 numeros


    public void leerNumeros() {

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Dijite otro numero: "));

    }
    //Metodo para sumar ambos numeros
    public void sumar(){
        suma = num1+num2;
    }
    //Metodo para restar ambos numeros
    public void restar(){
        resta = num1 - num2;
    }
    //Metodo para multiplicar ambos numeros
    public void multiplicar(){
        mult = num1*num2;
        }

    //Metodo para dividir ambos numeros
    public void dividir(){
        div = num1+num2;
    }

    public void mostrarResultados(){

        System.out.println("La suma es:"+suma);
        System.out.println("La resta es:"+resta);
        System.out.println("La multiplicacion es:"+mult);
        System.out.println("La division es: "+div);



    }





}






