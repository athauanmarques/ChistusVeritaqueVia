package com.example.tercochistusveritaquevia.controle;

public class ProgressoTerco{
    private static int posicaoTercoAtual;
    private static boolean tercoVirtual;

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
