import java.util.Scanner;
public class calculadora2 {

    public static void main (String[] args){

    



int numero1 ;
int numero2 ;
int resultado ;
char operador ; 

System.out.println ("Elige el primer numero") ;
numero1 = leer.nextInt ();

System.out.println("Selecciona el segundo numero");
numero2 = leer.nextInt ();


switch(opcion){
    case 1 :
    resultado= numero1 + numero2;
    System.out.println("El resultado es" + resultado);
    break;
    case 2 : 
    resultado= numero1 - numero2 ;
    System.out.println("El resultado es" + resultado);
    break;
    case 3 : 
    resultado = numero1 * numero2;
    System.out.println("El resultado es" + resultado);
    case 4:
    resultado = numero1 / numero2;
    System.out.println("El resultado es"+ resultado);
}
}

}