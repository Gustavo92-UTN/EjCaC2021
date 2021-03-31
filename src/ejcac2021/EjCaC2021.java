/*Ej
    ¿Cuantos numeros con el digito 6 hay entre 1 y 1200? */
package ejcac2021;
/*@author Gustavo Apaza Huanca*/
public class EjCaC2021 {
    public static void main(String[] args) {
        int contador = 0;
        String cadenaNum;
        /*int num = 600996;
        cadenaNum = Integer.toString(num);
        System.out.println(cadenaNum.indexOf("6", 0));*/
        /*
        indexOf buscara el string "6" en la cadena (empezara a buscar desde la posicion 0 de la cadena) y devolvera un numero, 
        este numero indica la posicion en la cadena donde encontro al "6" por 1ra vez, en caso de no encontrarlo devolvera un -1
        */
        for(int i = 1; i <= 1200; i++){
            cadenaNum = Integer.toString(i);
            
            if(cadenaNum.indexOf("6", 0) >= 0){
                System.out.print(cadenaNum + " / ");
                contador++;
            }
        }
        System.out.println("\n" + contador);
    }
}
