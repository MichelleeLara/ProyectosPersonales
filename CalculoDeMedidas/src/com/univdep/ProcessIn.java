package com.univdep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ProcessIn {

    private String ruta;
    private String contenido;
    String h ;
    String h1 ;

    public ProcessIn(){                     // opcion 2 del archivo del  main
        this.ruta = "C:/temp/dato.txt"; // ++++
        this.contenido = "";
        String h = "";
        String h1 = "";       // ++++
    }

    public ProcessIn (String path) {
        this.ruta = path;
        this.contenido = "";
        this.h = "";
        this.h1 = "";

    }

    public boolean Existe (){
        File archivo = new File(this.ruta);
        return archivo.exists();
    }

    public void LeeContenido(){
        File archivo = new File(this.ruta);
        try {
            FileReader fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);

            String tmp = br.readLine();
            while (tmp != null){
                this.contenido += tmp + "\n";
                tmp = br.readLine();
            }

            br.close();
            fr.close();

            if (this.contenido == null)
                this.contenido = "";

        }catch (Exception n ){
            this.contenido = "";
        }
    }


    public String getContenido () {return this.contenido;}



}