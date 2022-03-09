package com.univdep;

import javax.lang.model.type.ArrayType;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);
        int numerdeletras = 0, numeroDeLetras2 = 0, contadorOperador = 0, contadorLogico = 0;
        int numeroDeOperador = 0, NumeroDeOperador2 = 0, contadorLetras = 0 , numeroDeOperador3 = 0 , contadorLogic = 0;
        int rata = 0;
        int no2 = 0;
        String[] letras = {"a", "á", "é", "í", "ó", "ú", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z",  "A" , "Á" , "É" , "Í" , "Ó" , "Ú" , "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J" , "K" , "L" , "M" , "N" , "Ñ",
                "O" , "P" , "Q" , "R" , "S" , "T" , "U" , "V" , "W" , "X" , "Y" , "Z"};

        String[] operadores = {"+", "-", "x", "-", "{", "}", "[", "]", "*", "(", ")", "^", "/" , "++" , "+-"};
        String [] OperadoresCobinados = {"+=" , "-=" , "*=" , "/=" , "%=" };
        String [] OperadoresCondicioales = {"==" , "!=" , "<" , ">" , "<=" , ">="};
        String [] OperadoresLogicos = {"!" , "|" , "^" ,"&" , "||" , "&&"};

        String frase = "";
        try {
            System.out.println("\n                                                                                .:| Analizador Léxico |:.");
            System.out.println("\n\nIngresar algún texto [Sin importar números , caractéres , operadores , etc]");
            frase = data.nextLine();
        } catch (InputMismatchException q) {
            System.out.println("Error, debe de ingresar una cadena de texto");
            main(args);
            System.exit(0);
        }


       // String frase2 = frase.toLowerCase();
        String frasee = frase.trim();
        String z = frasee.replaceAll(" ", "");
        //System.out.println("frasee = " + frasee + "   " + z);


        for (int i = 0; i < z.length(); i++) {
            String d = String.valueOf(z.charAt(i));


            for (int k = 0; k < letras.length; k++) {
                if (d.equals(letras[k])) {


                    numeroDeLetras2++;


                    break;

                }
            }

        }

        for (int i = 0; i < z.length(); i++) {
            String ss = String.valueOf(z.charAt(i));


            for (int p = 0; p < operadores.length; p++) {
                if (ss.equals(operadores[p])) {


                    NumeroDeOperador2++;


                    break;

                }

            }
        }
        for (int i1 = 0; i1 < z.length(); i1++) {
            String ss = String.valueOf(z.charAt(i1));


            for (int p1 = 0; p1 < OperadoresLogicos.length; p1++) {
                if (ss.equals(OperadoresLogicos[p1])) {


                    numeroDeOperador3++;


                    break;

                }

            }
        }



        String texto1 = frase;


        StringBuilder palabras1 = new StringBuilder();
        String[] p_Restringidas1 = new String[]{"for", "while", "Do", "int", "char", "double", "float", "long"
                , "byte", "String", "new", "args", "void", "static", "pulic", "class", "if"
                , "else", "else if", "toString", "util", "import", "null", "try", "catch", "main"
                , "var", "break", "System", "out", "print", "printl", "append", "printf", "short"};
        int contador1 = 0, contador2 = 0 , contador3 = 0 , cont = 0;
        int tope1;
        String tmp1 = "";
        String f = "";

        while (!texto1.isEmpty()) {
            tope1 = texto1.indexOf(" ");


            if (tope1 > 0) {
                tmp1 = texto1.substring(0, tope1);
                texto1 = texto1.substring(texto1.indexOf(" ") + 1);

                f = tmp1 +" "+ texto1;

            } else {
                tmp1 = texto1;
                texto1 = "";
                f = "";
            }

            for (int k = 0; k < p_Restringidas1.length; k ++) {
                if (tmp1.equals(p_Restringidas1[k])) {


                    contador1++;

                    break;
                }
            }

            for (int k = 0; k < p_Restringidas1.length; k++) {
                if (f.equals(p_Restringidas1[k])) {


                    contador2++;

                    break;
                }

            }

            /*for (int k1 = 0; k1 < operadores.length; k1++) {
                if (tmp1.equals(p_Restringidas1[k1])) {


                    contador3++;

                    break;
                }

            }*/

            for (int k1 = 0; k1 < OperadoresLogicos.length; k1++) {
                if (tmp1.equals(OperadoresLogicos[k1])) {


                    cont++;

                    break;
                }

            }




        }

            String[] wn = new String[numeroDeLetras2];
            String[] to = new String[NumeroDeOperador2 ];
            String[] pr = new String[contador1 + contador2];
            String[] ol = new String[numeroDeOperador3 + cont ];

            for (int i = 0; i < z.length(); i++) {
                String l = String.valueOf(z.charAt(i));
                String s = String.valueOf(z.charAt(i));


                for (int k = 0; k < letras.length; k++) {
                    if (l.equals(letras[k])) {

                        contadorLetras++;

                        wn[contadorLetras - 1] = l;
                        numerdeletras++;


                        break;

                    }

                }

            }


            for (int x = 0; x < z.length(); x++) {
                String l = String.valueOf(z.charAt(x));
                String s = String.valueOf(z.charAt(x));

                for (int p = 0; p < operadores.length; p++) {
                    if (s.equals(operadores[p])) {

                        contadorOperador++;

                        to[contadorOperador - 1] = s;
                        numeroDeOperador++;


                        break;

                    }


                }
            }

            for (int i11 = 0; i11 < z.length(); i11++) {
            String ss = String.valueOf(z.charAt(i11));


            for (int p11 = 0; p11 < OperadoresLogicos.length; p11++) {
                if (ss.equals(OperadoresLogicos[p11])) {

                    contadorLogico++;
                    ol [contadorLogico -1] = ss;
                    contadorLogic++;


                    break;

                }

            }
        }







            String texto = frase;


            StringBuilder palabras = new StringBuilder();
            String[] p_Restringidas = new String[]{"for", "while", "Do", "int", "char", "double", "float", "long"
                    , "byte", "String", "new", "args", "void", "static", "pulic", "class", "if"
                    , "else", "else if", "toString", "util", "import", "null", "try", "catch", "main"
                    , "var", "break", "System", "out", "print", "printl", "append", "printf", "short"};
            int contador = 0  , contador11 = 0 , contadorUno = 0 , contadordos = 0;
            int contadorRestrigido = 0 ,cR2 = 0 ,cR3 = 0;
            int tope;
            String tmp = "";
            String f2 = "";

            while (!texto.isEmpty()) {
                tope = texto.indexOf(" ");


                if (tope > 0) {
                    tmp = texto.substring(0, tope);
                    texto = texto.substring(texto.indexOf(" ") + 1);

                    f2 = tmp + " " + texto;

                } else {
                    tmp = texto;
                    texto = "";

                    f2 = "";

                }


                for (int k = 0; k < p_Restringidas.length; k++) {
                    if (tmp.equals(p_Restringidas[k])) {


                        contadorRestrigido++;

                        pr[contadorRestrigido - 1] = tmp;

                        contador++;

                        break;

                    }

                }
                for (int k = 0; k < p_Restringidas.length; k++) {
                    if (f2.equals(p_Restringidas[k])) {


                        contadorRestrigido++;

                        pr[contadorRestrigido - 1] = f2;

                        contador11++;

                        break;

                    }

                }

                for (int k3 = 0; k3 < operadores.length; k3++) {
                    if (tmp.equals(operadores[k3])) {


                        cR2++;

                        to[cR2 -1] = tmp;

                        contadorUno++;

                        break;
                    }

                }

                for (int k1 = 0; k1 < OperadoresLogicos.length; k1++) {
                    if (tmp.equals(OperadoresLogicos[k1])) {

                        cR3++;
                        ol[cR3-1] = tmp;

                        contadordos++;

                        break;
                    }

                }


            }


            palabras.append("Palabras restringidas : " + (contador + contador11) + "   || palabras encontradas -> " + Arrays.toString(pr) + " ||" + "\n");
            System.out.println("");
            System.out.println(palabras.toString());


            System.out.println("Caracteres validos : " + numerdeletras + "   || caracteres encontrados -> " + Arrays.toString(wn) + " ||" + "\n");

            System.out.println("\n―――――――――――――――― | | Operdaores | | ――――――――――――――――" +"\n");
            System.out.println("◦ Numéricos : " + (numeroDeOperador) + "      ││   Operadores encontrados → " + Arrays.toString(to) + "   ││" + "\n");
            System.out.println("• Lógicos : " + (contadorLogic + contadordos ) + "      ││   Operadores Lógicos encontrados → "+ Arrays.toString(ol) + "   ││");

            //Profesor al momento de mostrar las palabras restringidas no hay éxito , ya que si muestra el numero de  las palabras y como tal las palabras pero con 'null'
            //no se por que no las almacena y las muestra como tal las palabras utilizadas y no solamente pone los null


        //Tipo de operadores :  aritmeticos, relacionales , lógicos , asignacion   (tambien tenemos lo unarios , ternarios , de bits, de instancia, incrementales)


    }
}

