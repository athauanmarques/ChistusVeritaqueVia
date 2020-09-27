package com.example.tercochistusveritaquevia.controle;

public class ProgressoTerco{
    private static int posicaoTercoAtual;
    private static boolean tercoVirtual;

    public int verificarTerco(){
        if(getPosicaoTercoAtual() >= 0){
            setPosicaoTercoAtual(1);
        }
        return getPosicaoTercoAtual();
    }

    public static int getPosicaoTercoAtual() {
        return posicaoTercoAtual;
    }

    public static void setPosicaoTercoAtual(int posicaoTercoAtual) {
        ProgressoTerco.posicaoTercoAtual =+ posicaoTercoAtual;
    }

    public static boolean isTercoVirtual() {
        return tercoVirtual;
    }

    public static void setTercoVirtual(boolean tercoVirtual) {
        ProgressoTerco.tercoVirtual = tercoVirtual;
    }
}
