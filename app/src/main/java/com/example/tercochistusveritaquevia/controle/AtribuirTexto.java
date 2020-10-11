package com.example.tercochistusveritaquevia.controle;

import android.content.Intent;

import com.example.tercochistusveritaquevia.R;

import static com.example.tercochistusveritaquevia.R.string.descricaoMt1Seg;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt2Seg;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt3Seg;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt4Seg;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt5Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt1Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt2Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt3Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt4Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt5Seg;
import static com.example.tercochistusveritaquevia.R.string.titulo2Mt;
import static com.example.tercochistusveritaquevia.R.string.titulo3Mt;
import static com.example.tercochistusveritaquevia.R.string.titulo4Mt;
import static com.example.tercochistusveritaquevia.R.string.titulo5Mt;

public class AtribuirTexto extends ProgressoTerco {
    private int titulo, img, subTitulo, oracao, exibirComponente = 2;
    private String enderecoFoto;

    public void executarTerco(){

        contarTerco();
        if(getPosicaoTercoAtual() == 1) {
            fixarTexto(5);// Pai Nosso
        } else if(getPosicaoTercoAtual() == 2) {
            fixarTexto(6);// Ave Maria
        } else if(getPosicaoTercoAtual() == 3){
            setImg(R.drawable.p3);
        } else if(getPosicaoTercoAtual() == 4){
            setImg(R.drawable.p4);
        } else if(getPosicaoTercoAtual() == 5){
            fixarTexto(7);// Glória
        } else if(getPosicaoTercoAtual() == 6){ //Primeiro Mistério
            setExibirComponente(0); //exibir
            atribuirMisterios(1);
        } else if(getPosicaoTercoAtual() == 7) {
            fixarTexto(1);// Pai Nosso
        } else if(getPosicaoTercoAtual() >= 8 && getPosicaoTercoAtual() <= 17) {
            fixarTexto(2);// Ave Maria
        }else if(getPosicaoTercoAtual() == 18) {
            fixarTexto(3);// Glória
        } else if(getPosicaoTercoAtual() == 19) {
            fixarTexto(4);// Jaculatoria
        }else if(getPosicaoTercoAtual() == 20) { //Segundo Mistério
            setExibirComponente(0); //exibir
            atribuirMisterios(2);
        }else if(getPosicaoTercoAtual() == 21) {
            fixarTexto(1);
        } else if(getPosicaoTercoAtual() >= 22 && getPosicaoTercoAtual() <= 31) {
            fixarTexto(2);
        }else if(getPosicaoTercoAtual() == 32) {
            fixarTexto(3);
        } else if(getPosicaoTercoAtual() == 33) {
            fixarTexto(4);
        }/*
        else if(getPosicaoTercoAtual() == 34) {
            //Terceiro Mistério
            setExibirComponente(0); //exibir
            atribuirMisterios(3);
        }else if(getPosicaoTercoAtual() == 35) {
            fixarTexto(1);
        } else if(getPosicaoTercoAtual() >= 36 && getPosicaoTercoAtual() <= 45) {
            fixarTexto(2);
        }else if(getPosicaoTercoAtual() == 46) {
            fixarTexto(3);
        } else if(getPosicaoTercoAtual() == 47) {
            fixarTexto(4);
        }
*/
    }

    public void fixarTexto(int op){
        if(op == 1) {
            setExibirComponente(2);
            setTitulo(R.string.lblPaiNossoTitulo);
            setImg(R.drawable.pai);
            setOracao(R.string.lblPaiNosso);
        } else if(op == 2) {
            setTitulo(R.string.lblAveMariaTitulo);
            mudarFoto();
            setOracao(R.string.lblAveMaria);
        } else if(op == 3){
            setTitulo(R.string.lblGloriaTitulo);
            mudarFoto();
            setOracao(R.string.lblGloria);
        } else if (op == 4){
            setTitulo(R.string.lblJaculatoriaTitulo);
            setImg(R.drawable.jaculatoria);
            setOracao(R.string.lblJaculatoria);
        } else if (op == 5){
            setTitulo(R.string.lblPaiNossoTitulo);
            setSubTitulo(R.string.lblIncioSubTitulo);
            setImg(R.drawable.p1);
            setOracao(R.string.lblPaiNosso);
        } else if (op == 6){
            setTitulo(R.string.lblAveMariaTitulo);
            setImg(R.drawable.p2);
            setOracao(R.string.lblAveMaria);
        } else if (op == 7){
            setTitulo(R.string.lblGloriaTitulo);
            setImg(R.drawable.p5);
            setOracao(R.string.lblGloria);
        }

    }

    public void mudarFoto(){
        switch (getPosicaoTercoAtual()) {
            //Primeira Parte Terço
            case 8:  setImg(R.drawable.p6); break;
            case 9:  setImg(R.drawable.p7); break;
            case 10: setImg(R.drawable.p8); break;
            case 11: setImg(R.drawable.p9); break;
            case 12: setImg(R.drawable.p10); break;
            case 13: setImg(R.drawable.p11); break;
            case 14: setImg(R.drawable.p12); break;
            case 15: setImg(R.drawable.p13); break;
            case 16: setImg(R.drawable.p14); break;
            case 17: setImg(R.drawable.p15); break;
            case 18: setImg(R.drawable.p16); break; //Gloria
            //Segunda Parte Terço
            case 22: setImg(R.drawable.p17); break;
            case 23: setImg(R.drawable.p18); break;
            case 24: setImg(R.drawable.p19); break;
            case 25: setImg(R.drawable.p20); break;
            case 26: setImg(R.drawable.p21); break;
            case 27: setImg(R.drawable.p22); break;
            case 28: setImg(R.drawable.p23); break;
            case 29: setImg(R.drawable.p24); break;
            case 30: setImg(R.drawable.p25); break;
            case 31: setImg(R.drawable.p26); break; //Gloria
            case 32:  setImg(R.drawable.p27);break;
        }
    }

    public void atribuirMisterios(int posicao){
        switch (diaHoje()) {
            case 2:
            case 7:
                if(posicao == 1){
                    setTitulo(R.string.titulo1Mt);
                    setSubTitulo(subTituloMt1Seg);
                    setImg(R.drawable.segmt1);
                    setOracao(descricaoMt1Seg);
                } else if(posicao == 2){
                    setTitulo(titulo2Mt);
                    setSubTitulo(subTituloMt2Seg);
                    setImg(R.drawable.segmt2);
                    setOracao(descricaoMt2Seg);
                } else if(posicao == 3){
                    setTitulo(titulo3Mt);
                    setSubTitulo(subTituloMt3Seg);
                    setImg(R.drawable.segmt3);
                    setOracao(descricaoMt3Seg);
                } else if(posicao == 4){
                    setTitulo(titulo4Mt);
                    setSubTitulo(subTituloMt4Seg);
                    setImg(R.drawable.segmt4);
                    setOracao(descricaoMt4Seg);
                }else if(posicao == 5){
                    setTitulo(titulo5Mt);
                    setSubTitulo(subTituloMt5Seg);
                    setImg(R.drawable.segmt5);
                    setOracao(descricaoMt5Seg);
                }

                break;
            case 3:
            case 6:


                break;
            case 4:
            case 1:
                //  this.msgMisterioDia = "Oração de hoje: Mistérios da Glória";
                break;
            case 5:
                //  this.msgMisterioDia = "Oração de hoje: Mistérios da Luz";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + diaHoje());
        }

    }





    public int getTitulo() {
        return titulo;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(int subTitulo) {
        this.subTitulo = subTitulo;
    }

    public int getOracao() {
        return oracao;
    }

    public void setOracao(int oracao) {
        this.oracao = oracao;
    }

    public int getExibirComponente() {
        return exibirComponente;
    }

    public void setExibirComponente(int exibirComponente) {
        this.exibirComponente = exibirComponente;
    }

    public String getEnderecoFoto() {
        return enderecoFoto;
    }

    public void setEnderecoFoto(String enderecoFoto) {
        this.enderecoFoto = enderecoFoto;
    }
}
