package com.example.tercochistusveritaquevia.controle;

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

    public void executarTerco(){
        contarTerco();
        if(getPosicaoTercoAtual() == 1) {
            setTitulo(R.string.lblPaiNossoTitulo);
            setSubTitulo(R.string.lblIncioSubTitulo);
            setImg(R.drawable.p1);
            setOracao(R.string.lblPaiNosso);
        } else if(getPosicaoTercoAtual() == 2) {
            setTitulo(R.string.lblAveMariaTitulo);
            setImg(R.drawable.p2);
            setOracao(R.string.lblAveMaria);
        } else if(getPosicaoTercoAtual() == 3){
            setImg(R.drawable.p3);
        } else if(getPosicaoTercoAtual() == 4){
            setImg(R.drawable.p4);
        } else if(getPosicaoTercoAtual() == 5){
            setTitulo(R.string.lblGloriaTitulo);
            setImg(R.drawable.p5);
            setOracao(R.string.lblGloria);
        }
        else if(getPosicaoTercoAtual() == 6){
            setExibirComponente(0); //exibir
            atribuirTextos();
        } if(getPosicaoTercoAtual() == 7) {
            setExibirComponente(2);
            setTitulo(R.string.lblPaiNossoTitulo);
            setImg(R.drawable.p1);
            setOracao(R.string.lblPaiNosso);
        }
    }

    public void atribuirTextos(){
        switch (diaHoje()) {
            case 2:
            case 7:
                if(getPosicaoTercoAtual() == 6){
                    setTitulo(R.string.titulo1Mt);
                    setSubTitulo(subTituloMt1Seg);
                    setImg(R.drawable.segmt1);
                    setOracao(descricaoMt1Seg);
                } else if(getPosicaoTercoAtual() ==18){
                    setTitulo(titulo2Mt);
                    setSubTitulo(subTituloMt2Seg);
                    // setImg(R.drawable.segmt2);
                    setOracao(descricaoMt2Seg);
                } else if(getPosicaoTercoAtual() == 31){
                    setTitulo(titulo3Mt);
                    setSubTitulo(subTituloMt3Seg);
                    // setImg(R.drawable.segmt3);
                    setOracao(descricaoMt3Seg);
                } else if(getPosicaoTercoAtual() == 44){
                    setTitulo(titulo4Mt);
                    setSubTitulo(subTituloMt4Seg);
                    // setImg(R.drawable.segmt4);
                    setOracao(descricaoMt4Seg);
                }else if(getPosicaoTercoAtual() == 57){
                    setTitulo(titulo5Mt);
                    setSubTitulo(subTituloMt5Seg);
                    // setImg(R.drawable.segmt5);
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
}
