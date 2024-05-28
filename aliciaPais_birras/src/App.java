import java.util.Random;
import java.util.Scanner;

public class App {
/*
Alicia tiene sed y se encuentra una cantina bajo un árbol.

El guarda de la cantina le pregunta si es Alicia. Si es que sí, entra.

El barman le pregunta qué desea: si es diferente a una birra,
entonces le dice que se vaya. Excepto si es una birra sin alcohol.

Alicia quiere una birra sin alcohol. Pero tiene una condición: si
el barman se pone a bailar, o el conejo blanco dice la hora correcta,
en tres intentos o menos, entonces, se pedirá una birra con alcohol.

Son las 20h.

* Hacer un programa que determine si Alicia entra a la cantina o no,
o bebe algo o no, y qué bebe dependiendo de cada caso.

* Se trata principalmente de trabajar la lógica y el planteamiento.
Ves paso por paso, no vayas a caerte por el agujero bajo el árbol.


 */
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("||GUARDA|| -- Hola, eres Alicia?");
        if(teclado.nextLine().equalsIgnoreCase("SI")){
            System.out.println("||GUARDA|| -- Perfecto, puedes pasar");
            System.out.println("\n\n||BARMAN|| -- ¿Qué deseas tomar?");
            System.out.println("1. Cerveza\n2. Cerveza sin alcohol\n3. Otra cosa\n4. Nada");
            int selection = teclado.nextInt();
            teclado.nextLine();
            switch (selection) {
                case 1:
                    System.out.println("Aquí tienes.");
                    break;
                case 2:
                    System.out.println("\n\n||BARMAN|| -- Ok, pero vamos a jugar...");
                    boolean estaBailando=bailar();
                    boolean horaAcertada=horaSombrerero();
                    if (estaBailando==true || horaAcertada==true) {
                        if(estaBailando==true){System.out.println("||BARMAN|| -- Vaya, me pillaste bailando...");}
                        if(horaAcertada==true){System.out.println("||Sombrero|| -- He acertado la horaaa!!");}
                        System.out.println("parece que tienes que pedir una cerveza con alcohol!");}
                    else {System.out.println("Aquí tienes tu cerveza sin alcohol");}
                    break;
            
                default:
                    System.out.println("||GUARDA|| -- Solo tenemos birra, vete por favor");
                    break;
            }

        }
        else {System.out.println("||GUARDA|| -- lo siento, no puedes pasar");}
    }


    public static boolean bailar(){
        Random bailando = new Random();
        return bailando.nextBoolean();
    }
    public static boolean horaSombrerero(){
        int horaOk = 20;
        int contador=0;
        int horaSorteo=0;
        while (contador<3 && horaSorteo!=horaOk) {
            Random hora = new Random();
            horaSorteo = hora.nextInt((24-1)+1);
            contador=contador+1;
        }
        
        if(horaSorteo==horaOk){
            return true;
        }else {
            return false;
        }


    }



}
