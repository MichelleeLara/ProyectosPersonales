package com.univdep;


public class dataEntry {
    
    String txt ;
    String index;
    String pf;
    String [] array;
    String [] array1;
    
    public dataEntry(){
        this.txt = "";
        this.index = "";
        this.pf  = "";

    }



    public void out() {

    ProcessIn A = new ProcessIn("C:/temp/dato.txt");

    if(A.Existe()) {
        A.LeeContenido();

        if (A.getContenido().isEmpty()) {
            System.err.println("Advertencia. El archivo no tiene contenido.");

        } else {
            txt = A.getContenido().replace(" " , "");
            index = txt.replace("\n" , " ");

            pf = index.replace(" " , "|");

            array = pf.split("\\|");
            int cont = 0 ;
            for (int i = 0 ; i < array.length ; i++ ){
                cont++;
            }

            if (cont % 6 == 0){
                System.out.println("listo sin error ");
            }else
                System.err.println("Errrrror");

        }
    }else
        System.err.println("Error. El archivo solictado no existe.");

    }



    public String [] Ya (){
        ProcessIn A = new ProcessIn("C:/temp/dato.txt");

        A.LeeContenido();
        String txt = A.getContenido().replace(" " , "");
        String index = txt.replace("\n" , " ");

        String pf = index.replace(" " , "|");

        String [] array = pf.split("\\|");
        return this.array;
    }
    public String[] getArray () {return array;}


}
