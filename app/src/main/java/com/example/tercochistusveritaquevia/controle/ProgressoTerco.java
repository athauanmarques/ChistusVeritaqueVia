package com.example.tercochistusveritaquevia.controle;

public class ProgressoTerco{
    private static int posicaoTercoAtual;
    private static boolean tercoVirtual;
    private int contador = 0;

    public int contarTerco(){
        if(getContador() >= 0){
            setContador(1);
            setPosicaoTercoAtual(getContador());
        }
        return getContador();
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador += contador;
    }

    public static int getPosicaoTercoAtual() {
        return posicaoTercoAtual;
    }

    public static void setPosicaoTercoAtual(int posicaoTercoAtual) {
        ProgressoTerco.posicaoTercoAtual = posicaoTercoAtual;
    }

    public static boolean isTercoVirtual() {
        return tercoVirtual;
    }

    public static void setTercoVirtual(boolean tercoVirtual) {
        ProgressoTerco.tercoVirtual = tercoVirtual;
    }
}
