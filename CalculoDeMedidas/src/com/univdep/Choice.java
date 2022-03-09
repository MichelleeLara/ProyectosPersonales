package com.univdep;


public class Choice extends ProcessIn {

    String txt ;
    String index;
    String pf;
    String [] array;
    double sumP;
    double promedio;
    double std;
    double stdV;
    private int[] arrayVarF;

    public Choice (){
        this.txt = "";
        this.index = "";
        this.pf = "";
        this.sumP = 0;
        this.promedio = 0;
        this.std = 0;
        this.stdV = 0;
    }

    public Choice (String [] a){
        array = a;
        this.txt = "";
        this.index = "";
        this.pf = "";
        this.sumP = 0;
        this.promedio = 0;
        this.std = 0;
        this.stdV = 0;
    }


    public void Convertion () {

        ProcessIn A = new ProcessIn("C:/temp/dato.txt");

        A.LeeContenido();
        String txt = A.getContenido().replace(" " , "");
        String index = txt.replace("\n" , " ");

        String pf = index.replace(" " , "|");

        String [] array = pf.split("\\|");


        int [] arrayInt = new int[array.length];
        int [] arrayVar = new int [array.length];
        int [] arrayModa = new int [array.length +1];




        for (int y = 0 ; y < array.length  ; y++){
            arrayInt [y] = Integer.parseInt(array[y]);
        }
        for (int f = 0 ; f<arrayInt.length ; f++){
            sumP += arrayInt[f];
        }
        int numero = arrayInt.length;
        this.promedio = sumP /numero;

        for (int x = 0 ; x<arrayInt.length ; x++){
            arrayVar [x]  = (int) ((Math.pow(arrayInt[x]-promedio , 2))/ numero);
        }
        for (int i = 0 ; i<arrayInt.length; i++){
             std += arrayVar[i];
        }

        this.stdV = Math.pow(std,2);

    }


    public double getAverage () {return this.promedio;}
    public double getStd () {return this.std;}
    public double getStdV () {return this.stdV;}

    public void run (){
        Choice g = new Choice();
        g.Convertion();
        g.getAverage();
        g.getStd();
        g.getStdV();

    }


}

