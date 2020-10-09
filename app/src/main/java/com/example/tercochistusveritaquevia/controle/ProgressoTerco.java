package com.example.tercochistusveritaquevia.controle;

import com.example.tercochistusveritaquevia.R;

public class ProgressoTerco{
    private static int posicaoTercoAtual;
    private static boolean tercoVirtual;
    private int contador = 0, tituloTC, imgTC, subTituloTC, oracaoTC, exibirBotao;


    public int contarTerco(){

            setContador(1);
            setPosicaoTercoAtual(getContador());
            executarTerco();

        return getContador();
        
    }

    public void executarTerco(){
        if(getPosicaoTercoAtual() == 1) {
            setTituloTC(R.string.lblPaiNossoTitulo);
            setSubTituloTC(R.string.lblIncioSubTitulo);
            setImgTC(R.drawable.p1);
            setOracaoTC(R.string.lblPaiNosso);
            setExibirBotao(2);
        } else if(getPosicaoTercoAtual() == 2) {
            setTituloTC(R.string.lblAveMariaTitulo);
            setImgTC(R.drawable.p2);
            setOracaoTC(R.string.lblAveMaria);
        } else if(getPosicaoTercoAtual() == 3){
            setImgTC(R.drawable.p3);
        } else if(getPosicaoTercoAtual() == 4){
            setImgTC(R.drawable.p4);
        } else if(getPosicaoTercoAtual() == 5){
            setTituloTC(R.string.lblGloriaTitulo);
            setImgTC(R.drawable.p5);
            setOracaoTC(R.string.lblGloria);
        }
        else if(getPosicaoTercoAtual() == 6){
            setTituloTC(R.string.titulo1Mt);
            setSubTituloTC(R.string.subTituloMt1Seg);
            setImgTC(R.drawable.segmt1);
            setOracaoTC(R.string.descricaoMt1Seg);
            setExibirBotao(0); //exibir
        } if(getPosicaoTercoAtual() == 7) {
            setTituloTC(R.string.lblPaiNossoTitulo);
            setImgTC(R.drawable.p1);
            setOracaoTC(R.string.lblPaiNosso);
            setExibirBotao(2);
        }
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

    public int getTituloTC() {
        return tituloTC;
    }

    public void setTituloTC(int tituloTC) {
        this.tituloTC = tituloTC;
    }

    public int getImgTC() {
        return imgTC;
    }

    public void setImgTC(int imgTC) {
        this.imgTC = imgTC;
    }

    public int getOracaoTC() {
        return oracaoTC;
    }

    public void setOracaoTC(int oracaoTC) {
        this.oracaoTC = oracaoTC;
    }

    public int getExibirBotao() {
        return exibirBotao;
    }

    public void setExibirBotao(int exibirBotao) {
        this.exibirBotao = exibirBotao;
    }

    public int getSubTituloTC() {
        return subTituloTC;
    }

    public void setSubTituloTC(int subTituloTC) {
        this.subTituloTC = subTituloTC;
    }
}
