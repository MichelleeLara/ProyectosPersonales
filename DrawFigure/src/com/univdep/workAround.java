package com.univdep;

public class workAround {
    private int value ;


    public workAround (){
        this.value = 0;
    }



    public void setTriangle (int value)
    {
        this.value = value;

    }

    public void goTriangle()  {
        for ( int f = 0 ; f <= value; f++) {
            for (int c = 0; c < f; c++) {
                System.out.print("●  ");
            }
            System.out.println("");
        }
    }

    public void goSupTriangle (){
        for ( int f = 0 ; f < value; f++) {
            for (int c = value-1-f; c >= 0; c--) {
                System.out.print("●  ");
            }
            System.out.println("");
        }
    }

    public void goArrowRigth (){
        double p = value + 1;
        for (int i = 0; i <= value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("●  ");
            }
            System.out.println("");
        }
        double h = value-1;
        for (int x = 0; x < value; x++) {
            for (int y = (int) ((value-1)-1-x); y >= 0 ; y--) {
                System.out.print("●  ");
            }
            System.out.println("");
        }
    }

    public void goRombhus () throws InterruptedException {
        for (int i = 0; i < value; i++) {
            for (int k = (value-1)-i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int h = 0; h <= i; h++) {
                Thread.sleep(800);
                System.out.print(" ●");
            }
            System.out.println("");
        }
        for (int r = 0; r < value; r++) {
            for (int h = 0; h <= r+1; h++) {
                System.out.print(" ");
            }
            for (int k = (value-2)-r; k >= 0; k--) {
                Thread.sleep(800);
                System.out.print(" ●");
            }
            System.out.println("");
        }
    }

    public void goArrowLeft () throws InterruptedException {
        for (int i = 0; i < value; i++) {
            for (int k = (value-1)-i; k >= 0; k--) {
                System.out.print("  ");
            }
            for (int h = 0; h <= i; h++) {
                Thread.sleep(300);
                System.out.print("● ");
            }
            System.out.println("");
        }
        for (int r = 0; r < value; r++) {
            for (int h = 0; h <= r+1; h++) {
                System.out.print("  ");
            }
            for (int k = (value-2)-r; k >= 0; k--) {
                Thread.sleep(300);
                System.out.print("● ");
            }
            System.out.println("");
        }
    }


}
