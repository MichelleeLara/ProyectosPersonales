package com.univdep;

import java.io.*;

public class Execution extends Choice  {

    public void now (){

        Choice H  = new Choice();
        H.Convertion();

        File archivo;
        try {
            archivo = new File("C:\\temp\\index.HTML");
            if (archivo.createNewFile()) {
                File f;
                FileWriter w ;
                BufferedWriter bw;
                PrintWriter wr;

                f = new File (String.valueOf(archivo));
                w = new FileWriter(f);
                bw = new BufferedWriter(w);
                wr = new PrintWriter(bw);

                wr.write(":: Operación Exitosa ! <br>" +
                        "El promedio de los datos es : " + H.getAverage()+ "<br>" +
                        "La varianza tiene como valor : "+ H.getStdV() + "<br>" +
                        "La Desviación es de : " + H.getStd());

                wr.close();
                bw.close();

                System.out.println("se ha creado el archivo con exito");
            }
        }catch (IOException e){
            System.err.println("No se pudo crear nada  " + e);
        }

    }

}
