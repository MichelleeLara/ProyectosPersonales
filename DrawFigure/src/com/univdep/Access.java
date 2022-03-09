package com.univdep;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import java.util.concurrent.Delayed;

public class Access {

    public void Go () throws InterruptedException {
        do {
            userInput();
            String User = new java.util.Scanner(System.in).nextLine();

            index();

            String select = new inputSee().getValueStr("  :: Ingresar un indice con respecto a la opcion requerida (por ejemplo -> c ): ");


            switch (select) {
                case "a" -> {
                    int numberLong = new inputSee().getValueUInt("  :: Ingresar un número del 1 al 25 , para definir el tamaño de la figura: ");
                    workAround D = new workAround();
                    D.setTriangle(numberLong);

                    System.out.println("\n::Exito en la ejcucion usurario " +"\033[35m" + User + "\u001B[0m" + " el resultado es el siguiente: " + "\033[35m");
                    D.goTriangle();
                    System.out.println("\u001B[0m");
                }
                case "b" -> {
                    int numberLong = new inputSee().getValueUInt("  :: Ingresar un número del 1 al 25 , para definir el tamaño de la figura: ");
                    workAround D = new workAround();
                    D.setTriangle(numberLong);

                    System.out.println("\n::Exito en la ejcucion usurario " +"\033[35m" + User + "\u001B[0m" + " el resultado es el siguiente: \n" + "\033[35m");
                    D.goSupTriangle();
                    System.out.println("\u001B[0m");
                }
                case "c" -> {
                    int numberLong = new inputSee().getValueUInt("  :: Ingresar un número del 1 al 25 , para definir el tamaño de la figura: ");
                    workAround D = new workAround();
                    D.setTriangle(numberLong);

                    System.out.println("\n::Exito en la ejcucion usurario " +"\033[35m" + User + "\u001B[0m" + " el resultado es el siguiente: \n" + "\033[35m");
                    D.goArrowRigth();
                    System.out.println("\u001B[0m");
                }
                case "d" -> {
                    int numberLong = new inputSee().getValueUInt("  :: Ingresar un número del 1 al 25 , para definir el tamaño de la figura: ");
                    workAround D = new workAround();
                    D.setTriangle(numberLong);

                    System.out.println("\n::Exito en la ejcucion usurario " +"\033[35m" + User + "\u001B[0m" + " el resultado es el siguiente: \n" + "\033[35m");
                    D.goArrowLeft();
                    System.out.println("\u001B[0m");
                }
                case "e" -> {
                    int numberLong = new inputSee().getValueUInt("  :: Ingresar un número del 1 al 25 , para definir el tamaño de la figura: ");
                    workAround D = new workAround();
                    D.setTriangle(numberLong);

                    System.out.println("\n::Exito en la ejcucion usurario " +"\033[35m" + User + "\u001B[0m" + " el resultado es el siguiente: \n" + "\033[35m");
                    D.goRombhus();
                    System.out.println("\u001B[0m");
                }
                case "f" -> {
                    System.out.println("\n  :: La ejecución ha finalizado usuario " +"\033[35m" + User + "\u001B[0m" + " gracias por participar en el proyecto. \n" + "\033[35m");
                    System.exit(0);
                }
                case "g" -> {
                    System.out.println("\n  :: Se ejecuturá un ejemplo de ejcución usuario " +"\033[33m" + User + "\u001B[0m" + " por favor mantener el mouse en la parte inferior de la consola." );
                    System.out.println("  :: De lo contrario NO se realizará con éxito la prueba.");
                    Thread.sleep(9500);

                    helpUser();
                    int numberLong = new inputSee().getValueUInt("  :: Se ingresará un valor dentro del rango establecido [1-25]: ");
                    System.out.print("  :: \033[33mConfigurando entorno ");
                    Processing();
                    Thread.sleep(200);
                    System.out.print("\u001B[0m");
                    System.out.println("\n"+ "\n");
                    workAround D = new workAround();
                    D.setTriangle(numberLong);

                    System.out.println("\n::Exito en la prueba usurario " +"\033[33m" + User +  "\u001B[0m" + " el resultado es el siguiente: \n" + "\033[33m");
                    D.goRombhus();
                    System.out.println("\u001B[0m");
                }
            }
        }while (new inputSee().getValueBoolean("\n\n  :: Ingresar \033[31m1\u001B[0m para \033[31mseguir\u001B[0m dibujando figuras ││" + " Ingresar \033[31m0\u001B[0m para \033[31msalir\u001B[0m del programa: "));

    }

    public void index (){
        System.out.println("\n"+"  :: Seleccionar una de las siguientes figuras:");
        System.out.println("  :: [a] Triángulo       [b] Triángulo Superior      [c] Flecha (->) ");
        System.out.println("  :: [d] Flecha (<-)     [e] Rombo                   [f] Salir" );
        System.out.println("  :: [g] Ayuda" + "\n" );
    }

    public void userInput(){
        System.out.println("\n                                                            :: Impresion de Figuras" + "\n");
        System.out.print("  :: Ingresar nombre de usuario o identificador caraterístico: ");
    }
    public static void helpUser() {
        try {
            Robot pressbot = new Robot();

            pressbot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            pressbot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);

            pressbot.keyPress(KeyEvent.VK_NUMPAD4);
            pressbot.keyPress(KeyEvent.VK_ENTER);

        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }

    public void Processing () throws InterruptedException {
        for (int x = 0; x<=5 ; x++){
            System.out.print(".");
            Thread.sleep(1000);
        }
    }


}
