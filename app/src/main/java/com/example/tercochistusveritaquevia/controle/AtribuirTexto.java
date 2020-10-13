package com.example.tercochistusveritaquevia.controle;

import android.content.Intent;

import com.example.tercochistusveritaquevia.R;

import static com.example.tercochistusveritaquevia.R.string.descricaoMt1Dom;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt1Qui;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt1Seg;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt1Ter;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt2Dom;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt2Qui;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt2Seg;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt2Ter;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt3Dom;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt3Qui;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt3Seg;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt3Ter;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt4Dom;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt4Qui;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt4Seg;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt4Ter;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt5Dom;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt5Qui;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt5Seg;
import static com.example.tercochistusveritaquevia.R.string.descricaoMt5Ter;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt1Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt2Dom;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt2Qui;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt2Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt2Ter;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt3Dom;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt3Qui;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt3Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt3Ter;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt4Dom;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt4Qui;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt4Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt4Ter;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt5Dom;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt5Qui;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt5Seg;
import static com.example.tercochistusveritaquevia.R.string.subTituloMt5Ter;
import static com.example.tercochistusveritaquevia.R.string.titulo2Mt;
import static com.example.tercochistusveritaquevia.R.string.titulo3Mt;
import static com.example.tercochistusveritaquevia.R.string.titulo4Mt;
import static com.example.tercochistusveritaquevia.R.string.titulo5Mt;

public class AtribuirTexto extends ProgressoTerco{
    private String msgMisterioDia;
    private static boolean tipoIdioma;
    private int titulo, img, subTitulo, oracao, exibirComponente = 2, exibirBotao = 0;
    private int subTituloMt1Tv, imgMt1Tv, descricaoMt1Tv,
            subTituloMt2Tv, imgMt2Tv, descricaoMt2Tv,
            subTituloMt3Tv, imgMt3Tv, descricaoMt3Tv,
            subTituloMt4Tv, imgMt4Tv, descricaoMt4Tv,
            subTituloMt5Tv, imgMt5Tv, descricaoMt5Tv;


// //------------- Metodos -----------------------
    public void executarTerco(){
           contarTerco();
           if(getPosicaoTercoAtual() == 1) {  fixarTexto(5); }  // Pai Nosso
           else if(getPosicaoTercoAtual() == 2) { fixarTexto(6); } // Ave Maria
           else if(getPosicaoTercoAtual() == 3){ setImg(R.drawable.p3); }
           else if(getPosicaoTercoAtual() == 4){ setImg(R.drawable.p4);}
           else if(getPosicaoTercoAtual() == 5){ fixarTexto(7);} // Glória
           //Primeiro Mistério
            else if(getPosicaoTercoAtual() == 6){ atribuirMisterios(1); }
            else if(getPosicaoTercoAtual() == 7) { fixarTexto(1);} // Pai Nosso
            else if(getPosicaoTercoAtual() >= 8 && getPosicaoTercoAtual() <= 17) { fixarTexto(2);}  // Ave Maria
            else if(getPosicaoTercoAtual() == 18) { fixarTexto(3);} // Glória
            else if(getPosicaoTercoAtual() == 19) { fixarTexto(4); // Jaculatoria
            }//Segundo Mistério
            else if(getPosicaoTercoAtual() == 20) {atribuirMisterios(2); }
            else if(getPosicaoTercoAtual() == 21) {fixarTexto(1);}
            else if(getPosicaoTercoAtual() >= 22 && getPosicaoTercoAtual() <= 31) {fixarTexto(2);}
            else if(getPosicaoTercoAtual() == 32) { fixarTexto(3);}
            else if(getPosicaoTercoAtual() == 33) { fixarTexto(4);}
            //Terceiro Mistério
            else if(getPosicaoTercoAtual() == 34) {atribuirMisterios(3);}
            else if(getPosicaoTercoAtual() == 35) {  fixarTexto(1);}
            else if(getPosicaoTercoAtual() >= 36 && getPosicaoTercoAtual() <= 45) { fixarTexto(2);}
            else if(getPosicaoTercoAtual() == 46) { fixarTexto(3);}
            else if(getPosicaoTercoAtual() == 47) {fixarTexto(4);}
            //Quarto Mistério
            else if(getPosicaoTercoAtual() == 48) {atribuirMisterios(4); }
            else if(getPosicaoTercoAtual() == 49) { fixarTexto(1);}
            else if(getPosicaoTercoAtual() >= 50 && getPosicaoTercoAtual() <= 59) { fixarTexto(2);}
            else if(getPosicaoTercoAtual() == 60) { fixarTexto(3);}
            else if(getPosicaoTercoAtual() == 61) { fixarTexto(4);}
            //Quinto Mistério
            else if(getPosicaoTercoAtual() == 62) { atribuirMisterios(5);}
            else if(getPosicaoTercoAtual() == 63) { fixarTexto(1);}
            else if(getPosicaoTercoAtual() >= 64 && getPosicaoTercoAtual() <= 73) { fixarTexto(2); }
            else if(getPosicaoTercoAtual() == 74) {  fixarTexto(3); }
            //Agredecimentos
            else if(getPosicaoTercoAtual() == 75) { fixarTexto(4); setExibirBotao(2); }
    }

    public void fixarTexto(int op){
        if(op == 1) {
            setExibirComponente(2);
            idiomaSelecionado(1); //Pai Nosso
            setImg(R.drawable.pai);
        } else if(op == 2) {
            idiomaSelecionado(2); //Ave Maria
            mudarFoto();
        } else if(op == 3){
            idiomaSelecionado(3); //Glória
            mudarFoto();
        } else if (op == 4){
            idiomaSelecionado(4); //jaculatoria
            setImg(R.drawable.jaculatoria);
        } else if (op == 5){
            idiomaSelecionado(1); //Pai Nosso
            setSubTitulo(R.string.lblIncioSubTitulo);
            setImg(R.drawable.p1);
        } else if (op == 6){
            idiomaSelecionado(2); //Ave Maria
            setImg(R.drawable.p2);
        } else if (op == 7) {
            idiomaSelecionado(3); //Glória
            setImg(R.drawable.p5);
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
            case 32: setImg(R.drawable.p27); break;
            //Terceira Parte Terço
            case 36: setImg(R.drawable.p28); break;
            case 37: setImg(R.drawable.p29); break;
            case 38: setImg(R.drawable.p30); break;
            case 39: setImg(R.drawable.p31); break;
            case 40: setImg(R.drawable.p32); break;
            case 41: setImg(R.drawable.p33); break;
            case 42: setImg(R.drawable.p34); break;
            case 43: setImg(R.drawable.p35); break;
            case 44: setImg(R.drawable.p36); break;
            case 45: setImg(R.drawable.p37); break;
            case 46: setImg(R.drawable.p38); break; //Gloria
            //Quarta Parte Terço
            case 50: setImg(R.drawable.p40); break;
            case 51: setImg(R.drawable.p41); break;
            case 52: setImg(R.drawable.p42); break;
            case 53: setImg(R.drawable.p43); break;
            case 54: setImg(R.drawable.p44); break;
            case 55: setImg(R.drawable.p45); break;
            case 56: setImg(R.drawable.p46); break;
            case 57: setImg(R.drawable.p47); break;
            case 58: setImg(R.drawable.p48); break;
            case 59: setImg(R.drawable.p49); break;
            case 60: setImg(R.drawable.p50); break; //Gloria
            //Quinta Parte Terço
            case 64: setImg(R.drawable.p51); break;
            case 65: setImg(R.drawable.p52); break;
            case 66: setImg(R.drawable.p53); break;
            case 67: setImg(R.drawable.p54); break;
            case 68: setImg(R.drawable.p55); break;
            case 69: setImg(R.drawable.p56); break;
            case 70: setImg(R.drawable.p57); break;
            case 71: setImg(R.drawable.p58); break;
            case 72: setImg(R.drawable.p59); break;
            case 73: setImg(R.drawable.p60); break;
            case 74: setImg(R.drawable.completo); break; //Gloria
        }
    }

    public void atribuirMisterios(int posicao){
        switch (diaHoje()) {
            case 2:
            case 7:
                if(posicao == 1){
                    setExibirComponente(0);
                    setTitulo(R.string.titulo1Mt);
                    setSubTitulo(subTituloMt1Seg);
                    setImg(R.drawable.segmt1);
                    setOracao(descricaoMt1Seg);
                } else if(posicao == 2){
                    setExibirComponente(0);
                    setTitulo(titulo2Mt);
                    setSubTitulo(subTituloMt2Seg);
                    setImg(R.drawable.segmt2);
                    setOracao(descricaoMt2Seg);
                } else if(posicao == 3){
                    setExibirComponente(0);
                    setTitulo(titulo3Mt);
                    setSubTitulo(subTituloMt3Seg);
                    setImg(R.drawable.segmt3);
                    setOracao(descricaoMt3Seg);
                } else if(posicao == 4){
                    setExibirComponente(0);
                    setTitulo(titulo4Mt);
                    setSubTitulo(subTituloMt4Seg);
                    setImg(R.drawable.segmt4);
                    setOracao(descricaoMt4Seg);
                }else if(posicao == 5){
                    setExibirComponente(0);
                    setTitulo(titulo5Mt);
                    setSubTitulo(subTituloMt5Seg);
                    setImg(R.drawable.segmt5);
                    setOracao(descricaoMt5Seg);
                }
                break;
            case 3:
            case 6:
                if(posicao == 1){
                    setExibirComponente(0);
                    setTitulo(R.string.titulo1Mt);
                    setSubTitulo(R.string.subTituloMt1Ter);
                    setImg(R.drawable.termt1);
                    setOracao(R.string.descricaoMt1Ter);
                } else if(posicao == 2){
                    setExibirComponente(0);
                    setTitulo(titulo2Mt);
                    setSubTitulo(R.string.subTituloMt2Ter);
                    setImg(R.drawable.termt2);
                    setOracao(R.string.descricaoMt2Ter);
                } else if(posicao == 3){
                    setExibirComponente(0);
                    setTitulo(titulo3Mt);
                    setSubTitulo(R.string.subTituloMt3Ter);
                    setImg(R.drawable.termt3);
                    setOracao(R.string.descricaoMt3Ter);
                } else if(posicao == 4){
                    setExibirComponente(0);
                    setTitulo(titulo4Mt);
                    setSubTitulo(R.string.subTituloMt4Ter);
                    setImg(R.drawable.termt4);
                    setOracao(R.string.descricaoMt4Ter);
                }else if(posicao == 5){
                    setExibirComponente(0);
                    setTitulo(titulo5Mt);
                    setSubTitulo(R.string.subTituloMt5Ter);
                    setImg(R.drawable.termt5);
                    setOracao(R.string.descricaoMt5Ter);
                }
                break;
            case 4:
            case 1:
                if(posicao == 1){
                    setExibirComponente(0);
                    setTitulo(R.string.titulo1Mt);
                    setSubTitulo(R.string.subTituloMt1Dom);
                    setImg(R.drawable.domt1);
                    setOracao(R.string.descricaoMt1Dom);
                } else if(posicao == 2){
                    setExibirComponente(0);
                    setTitulo(titulo2Mt);
                    setSubTitulo(R.string.subTituloMt2Dom);
                    setImg(R.drawable.domt2);
                    setOracao(R.string.descricaoMt2Dom);
                } else if(posicao == 3){
                    setExibirComponente(0);
                    setTitulo(titulo3Mt);
                    setSubTitulo(R.string.subTituloMt3Dom);
                    setImg(R.drawable.domt3);
                    setOracao(R.string.descricaoMt3Dom);
                } else if(posicao == 4){
                    setExibirComponente(0);
                    setTitulo(titulo4Mt);
                    setSubTitulo(R.string.subTituloMt4Dom);
                    setImg(R.drawable.domt4);
                    setOracao(R.string.descricaoMt4Dom);
                }else if(posicao == 5){
                    setExibirComponente(0);
                    setTitulo(titulo5Mt);
                    setSubTitulo(R.string.subTituloMt5Dom);
                    setImg(R.drawable.domt5);
                    setOracao(R.string.descricaoMt5Dom);
                }
                break;
            case 5:
                if(posicao == 1){
                    setExibirComponente(0);
                    setTitulo(R.string.titulo1Mt);
                    setSubTitulo(R.string.subTituloMt1Qui);
                    setImg(R.drawable.quimt1);
                    setOracao(R.string.descricaoMt1Qui);
                } else if(posicao == 2){
                    setExibirComponente(0);
                    setTitulo(titulo2Mt);
                    setSubTitulo(R.string.subTituloMt2Qui);
                    setImg(R.drawable.quimt2);
                    setOracao(R.string.descricaoMt2Qui);
                } else if(posicao == 3){
                    setExibirComponente(0);
                    setTitulo(titulo3Mt);
                    setSubTitulo(R.string.subTituloMt3Qui);
                    setImg(R.drawable.quimt3);
                    setOracao(R.string.descricaoMt3Qui);
                } else if(posicao == 4){
                    setExibirComponente(0);
                    setTitulo(titulo4Mt);
                    setSubTitulo(R.string.subTituloMt4Qui);
                    setImg(R.drawable.quimt4);
                    setOracao(R.string.descricaoMt4Qui);
                }else if(posicao == 5){
                    setExibirComponente(0);
                    setTitulo(titulo5Mt);
                    setSubTitulo(R.string.subTituloMt5Qui);
                    setImg(R.drawable.quimt5);
                    setOracao(R.string.descricaoMt5Qui);
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + diaHoje());
        }

    }

    public void atribuirMisterios(){

        //aplicado somente no TercoVirtualActivity
        switch (diaHoje()) {
            // Segunda/Sábados = Mistérios da Alegria (2-7)
            case 2:
            case 7:
                //1ºMistério
                setSubTituloMt1Tv(subTituloMt1Seg);
                setImgMt1Tv(R.drawable.segmt1);
                setDescricaoMt1Tv(descricaoMt1Seg);
                //2ºMistério
                setSubTituloMt2Tv(subTituloMt2Seg);
                setImgMt2Tv(R.drawable.segmt2);
                setDescricaoMt2Tv(descricaoMt2Seg);
                //3ºMistério
                setSubTituloMt3Tv(subTituloMt3Seg);
                setImgMt3Tv(R.drawable.segmt3);
                setDescricaoMt3Tv(descricaoMt3Seg);
                //4ºMistério
                setSubTituloMt4Tv(subTituloMt4Seg);
                setImgMt4Tv(R.drawable.segmt4);
                setDescricaoMt4Tv(descricaoMt4Seg);
                //5ºMistério
                setSubTituloMt5Tv(subTituloMt5Seg);
                setImgMt5Tv(R.drawable.segmt5);
                setDescricaoMt5Tv(descricaoMt5Seg);
                break;
            //Terça/Sextas = Mistérios da Dor (3-6)
            case 3:
            case 6:
                //1ºMistério
                setSubTituloMt1Tv(R.string.subTituloMt1Ter);
                setImgMt1Tv(R.drawable.termt1);
                setDescricaoMt1Tv(descricaoMt1Ter);
                //2ºMistério
                setSubTituloMt2Tv(subTituloMt2Ter);
                setImgMt2Tv(R.drawable.termt2);
                setDescricaoMt2Tv(descricaoMt2Ter);
                //3ºMistério
                setSubTituloMt3Tv(subTituloMt3Ter);
                setImgMt3Tv(R.drawable.termt3);
                setDescricaoMt3Tv(descricaoMt3Ter);
                //4ºMistério
                setSubTituloMt4Tv(subTituloMt4Ter);
                setImgMt4Tv(R.drawable.termt4);
                setDescricaoMt4Tv(descricaoMt4Ter);
                //5ºMistério
                setSubTituloMt5Tv(subTituloMt5Ter);
                setImgMt5Tv(R.drawable.termt5);
                setDescricaoMt5Tv(descricaoMt5Ter);
                break;
            //Quarta/Domingos = Mistérios da Glória (4-1)
            case 4:
            case 1:
                //1ºMistério
                setSubTituloMt1Tv(R.string.subTituloMt1Dom);
                setImgMt1Tv(R.drawable.domt1);
                setDescricaoMt1Tv(descricaoMt1Dom);
                //2ºMistério
                setSubTituloMt2Tv(subTituloMt2Dom);
                setImgMt2Tv(R.drawable.domt2);
                setDescricaoMt2Tv(descricaoMt2Dom);
                //3ºMistério
                setSubTituloMt3Tv(subTituloMt3Dom);
                setImgMt3Tv(R.drawable.domt3);
                setDescricaoMt3Tv(descricaoMt3Dom);
                //4ºMistério
                setSubTituloMt4Tv(subTituloMt4Dom);
                setImgMt4Tv(R.drawable.domt4);
                setDescricaoMt4Tv(descricaoMt4Dom);
                //5ºMistério
                setSubTituloMt5Tv(subTituloMt5Dom);
                setImgMt5Tv(R.drawable.termt5);
                setDescricaoMt5Tv(descricaoMt5Dom);
                break;
            //Quintas-feiras = Mistério da Luz (5)
            case 5:
                //1ºMistério
                setSubTituloMt1Tv(R.string.subTituloMt1Qui);
                setImgMt1Tv(R.drawable.quimt1);
                setDescricaoMt1Tv(descricaoMt1Qui);
                //2ºMistério
                setSubTituloMt2Tv(subTituloMt2Qui);
                setImgMt2Tv(R.drawable.quimt2);
                setDescricaoMt2Tv(descricaoMt2Qui);
                //3ºMistério
                setSubTituloMt3Tv(subTituloMt3Qui);
                setImgMt3Tv(R.drawable.quimt3);
                setDescricaoMt3Tv(descricaoMt3Qui);
                //4ºMistério
                setSubTituloMt4Tv(subTituloMt4Qui);
                setImgMt4Tv(R.drawable.quimt4);
                setDescricaoMt4Tv(descricaoMt4Qui);
                //5ºMistério
                setSubTituloMt5Tv(subTituloMt5Qui);
                setImgMt5Tv(R.drawable.quimt5);
                setDescricaoMt5Tv(descricaoMt5Qui);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + diaHoje());
        }

    }

    public void idiomaSelecionado(int opIdioma) {
        //true == latim
        if (tipoIdioma) {
            switch (opIdioma) {
                case 0:
                    setTitulo(R.string.lblCreioTituloLT);
                    setOracao(R.string.lblCreioLT);
                    break;
                 case 1:
                    setTitulo(R.string.lblPaiNossoTituloLT);
                    setOracao(R.string.lblPaiNossoLT);
                    break;
                case 2:
                    setTitulo(R.string.lblAveMariaTituloLT);
                    setOracao(R.string.lblAveMariaLT);
                    break;
                case 3:
                    setTitulo(R.string.lblGloriaTituloLT);
                    setOracao(R.string.lblGloriaLT);
                    break;
                case 4:
                    setTitulo(R.string.lblJaculatoriaTituloLT);
                    setOracao(R.string.lblJaculatoriaLT);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opIdioma);
            }
        } else {
            switch (opIdioma) {
                case 0:
                    setTitulo(R.string.lblCreioTitulo);
                    setOracao(R.string.lblCreio);
                    break;
               case 1:
                    setTitulo(R.string.lblPaiNossoTitulo);
                    setOracao(R.string.lblPaiNosso);
                    break;
                case 2:
                    setTitulo(R.string.lblAveMariaTitulo);
                    setOracao(R.string.lblAveMaria);
                    break;
                case 3:
                    setTitulo(R.string.lblGloriaTitulo);
                    setOracao(R.string.lblGloria);
                    break;
                case 4:
                    setTitulo(R.string.lblJaculatoriaTitulo);
                    setOracao(R.string.lblJaculatoria);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + opIdioma);
            }

        }
    }

    public String misterioSemanaExibir() {

        switch (diaHoje()) {
            case 2: case 7: this.msgMisterioDia = "Oração de hoje: Mistérios da Alegria"; break;
            case 3: case 6: this.msgMisterioDia = "Oração de hoje: Mistérios da Dor"; break;
            case 4: case 1: this.msgMisterioDia = "Oração de hoje: Mistérios da Glória"; break;
            case 5: this.msgMisterioDia = "Oração de hoje: Mistérios da Luz"; break;
            default: throw new IllegalStateException("Unexpected value: " + diaHoje());
        }
        return getMsgMisterioDia();

    }


    //------------- Getters e Setters -----------------------


    public int getSubTituloMt1Tv() {
        return subTituloMt1Tv;
    }

    public void setSubTituloMt1Tv(int subTituloMt1Tv) {
        this.subTituloMt1Tv = subTituloMt1Tv;
    }

    public int getImgMt1Tv() {
        return imgMt1Tv;
    }

    public void setImgMt1Tv(int imgMt1Tv) {
        this.imgMt1Tv = imgMt1Tv;
    }

    public int getDescricaoMt1Tv() {
        return descricaoMt1Tv;
    }

    public void setDescricaoMt1Tv(int descricaoMt1Tv) {
        this.descricaoMt1Tv = descricaoMt1Tv;
    }

    public int getSubTituloMt2Tv() {
        return subTituloMt2Tv;
    }

    public void setSubTituloMt2Tv(int subTituloMt2Tv) {
        this.subTituloMt2Tv = subTituloMt2Tv;
    }

    public int getImgMt2Tv() {
        return imgMt2Tv;
    }

    public void setImgMt2Tv(int imgMt2Tv) {
        this.imgMt2Tv = imgMt2Tv;
    }

    public int getDescricaoMt2Tv() {
        return descricaoMt2Tv;
    }

    public void setDescricaoMt2Tv(int descricaoMt2Tv) {
        this.descricaoMt2Tv = descricaoMt2Tv;
    }

    public int getSubTituloMt3Tv() {
        return subTituloMt3Tv;
    }

    public void setSubTituloMt3Tv(int subTituloMt3Tv) {
        this.subTituloMt3Tv = subTituloMt3Tv;
    }

    public int getImgMt3Tv() {
        return imgMt3Tv;
    }

    public void setImgMt3Tv(int imgMt3Tv) {
        this.imgMt3Tv = imgMt3Tv;
    }

    public int getDescricaoMt3Tv() {
        return descricaoMt3Tv;
    }

    public void setDescricaoMt3Tv(int descricaoMt3Tv) {
        this.descricaoMt3Tv = descricaoMt3Tv;
    }

    public int getSubTituloMt4Tv() {
        return subTituloMt4Tv;
    }

    public void setSubTituloMt4Tv(int subTituloMt4Tv) {
        this.subTituloMt4Tv = subTituloMt4Tv;
    }

    public int getImgMt4Tv() {
        return imgMt4Tv;
    }

    public void setImgMt4Tv(int imgMt4Tv) {
        this.imgMt4Tv = imgMt4Tv;
    }

    public int getDescricaoMt4Tv() {
        return descricaoMt4Tv;
    }

    public void setDescricaoMt4Tv(int descricaoMt4Tv) {
        this.descricaoMt4Tv = descricaoMt4Tv;
    }

    public int getSubTituloMt5Tv() {
        return subTituloMt5Tv;
    }

    public void setSubTituloMt5Tv(int subTituloMt5Tv) {
        this.subTituloMt5Tv = subTituloMt5Tv;
    }

    public int getImgMt5Tv() {
        return imgMt5Tv;
    }

    public void setImgMt5Tv(int imgMt5Tv) {
        this.imgMt5Tv = imgMt5Tv;
    }

    public int getDescricaoMt5Tv() {
        return descricaoMt5Tv;
    }

    public void setDescricaoMt5Tv(int descricaoMt5Tv) {
        this.descricaoMt5Tv = descricaoMt5Tv;
    }

    public String getMsgMisterioDia() {
        return msgMisterioDia;
    }

    public void setMsgMisterioDia(String msgMisterioDia) {
        this.msgMisterioDia = msgMisterioDia;
    }

    public static boolean isTipoIdioma() {
        return tipoIdioma;
    }

    public static void setTipoIdioma(boolean tipoIdioma) {
        AtribuirTexto.tipoIdioma = tipoIdioma;
    }

    public int getExibirBotao() {
        return exibirBotao;
    }

    public void setExibirBotao(int exibirBotao) {
        this.exibirBotao = exibirBotao;
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
