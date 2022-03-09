package com.univdep;

public class inputSee {

    public String getValueUStr (String message){
        do {
            try {
                System.out.println(message);
                return new java.util.Scanner(System.in).nextLine();
            }catch (Exception x){
                System.err.println("Error Ax0002 :: Sólo esta permitido el ingreso de letras/simbolos " + "\n" +
                        "                ya requeridos , intentar de nuevo.");
            }
        }while (true);
    }

    public String getValueStr (String message){
        do {
            try {
                System.out.print(message);
                message =  new java.util.Scanner(System.in).nextLine();

                if (!message.equals("a")  && !message.equals("b") && !message.equals("c")  && !message.equals("d") && !message.equals("e")  && !message.equals("f")   && !message.equals("g")             ){
                    System.err.println("Error Ax0001 :: Sólo esta permitido la selección conforme a los parámetros"+ "\n" +
                                       "                establecidos, intentar de nuevo.");
                }else
                    return message;
            }catch (Exception x){
                System.err.println("Error Ax0002 :: Sólo esta permitido la selección conforme a los valores " + "\n" +
                                   "                requeridos , intentar de nuevo.");
            }
        }while (true);
    }

    public int getValueInt (String message){
        do {
            try {
                System.out.println(message);
                return new java.util.Scanner(System.in).nextInt();
            }catch (Exception e){
                System.err.println("Error Bx001 :: Sólo esta permitido el uso de valores numéricos enteros.");
            }
        }while (true);
    }

    public int getValueUInt (String message){
        do {
            try {
                System.out.print(message);
                int value = new java.util.Scanner(System.in).nextInt();
                if (value <= 0 || value > 25){
                    System.err.println("Error Bx002 :: Sólo esta permitido el ingreso de datos en el rango" +"\n" +
                                       "               establecido.");
                }else
                    return value;
            }catch (Exception x){
                System.err.println("Error Bx001 :: Sólo esta permitido el uso de valores numéricos enteros.");
            }
        }while (true);
    }

    public boolean getValueBoolean (String message){
        do {
            try {
                System.out.print(message);
                int value = new java.util.Scanner(System.in).nextInt();
                if (value == 0){
                    return false;
                }else {
                    return true;
                }
            }catch (Exception c){
                System.err.println("Error Cx001 :: Sólo esta permitido el uso de valores numéricos enteros."+ "\n"+
                                   "            :: Selecionar dentro de los parámetros establecidos.");
            }
        }while (true);


    }






}
