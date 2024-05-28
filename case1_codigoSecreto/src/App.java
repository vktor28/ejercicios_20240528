import java.util.ArrayList;
import java.util.Scanner;

public class App {
/*
Hemos entrado en guerra con Corea del Norte y necesitamos codificar nuestros mensajes para evitar que nuestros planes sean interceptados.
Te han encargado el siguiente programa para salvar el mundo:


Realiza dos métodos: CODIFICAR y DESCODIFICAR


- CODIFICAR: introduce el mensaje a enviar. Como resultado, en pantalla
solo veremos una transformación de cualquier tipo que pueda mostrar la terminal:
pasar a números ASCII,  cambiar una letra por otra, etc.


- DESCODIFICAR: la persona que recibe el mensaje posee el programa para descodificarlo.


Se precisa de una clave traductora que conocen ambas partes.


Puedes simplificarlo o complicarlo tanto como quieras mientras funcione.
 */
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Integer> mensajeCifrado = new ArrayList<>();
        System.out.println("Indica el mensaje que quieres enviar");
        String mensaje = teclado.nextLine();
        
        System.out.println("\n------------\n");
        System.out.println("Quieres codificar el mensaje?(SI/NO)");
        if(teclado.nextLine().equalsIgnoreCase("SI")){
            codificar(mensaje,mensajeCifrado);

        }
            else {System.out.println(mensaje);}
            
        System.out.println("\n------------\n");
        System.out.println("¿Quieres descodificar el mensaje?");    
        if(teclado.nextLine().equalsIgnoreCase("SI")){
            descodificar(mensajeCifrado);

        }
            else {System.out.println(mensaje);}
        }

    

        public static void codificar(String mensaje,ArrayList <Integer> mensajeCifrado) {
            int longitud=mensaje.length();
            for(int i=0; i<longitud; i++){
                System.out.print((int) mensaje.charAt(i));
                mensajeCifrado.add((int) mensaje.charAt(i));
                
            }
        }
        public static void descodificar (ArrayList <Integer> mensajeCifrado){
            for(int i=0; i<mensajeCifrado.size(); i++){
               int letra = mensajeCifrado.get(i);
               System.out.print((char) letra);
              

                
            }
            System.out.println("\n-------------\n");
        }
    }
    
    

