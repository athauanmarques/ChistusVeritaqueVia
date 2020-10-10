package com.example.tercochistusveritaquevia.controle;

import com.example.tercochistusveritaquevia.R;

import java.util.Calendar;

import static java.util.Calendar.DAY_OF_WEEK;

public class ProgressoTerco{
    private String msgMisterioDia;
    private static int posicaoTercoAtual;
    private static boolean tercoVirtual;
    private int contador = 0;


    public int contarTerco(){

            setContador(1);
            setPosicaoTercoAtual(getContador());

        return getContador();
        
    }

    public int diaHoje(){
        Calendar cal = Calendar.getInstance();
        int dia = cal.get(DAY_OF_WEEK);
        return  dia;
    }

    public String misterioSemanaExibir() {

        switch (diaHoje()) {
            case 2:
            case 7:
                this.msgMisterioDia = "Oração de hoje: Mistérios da Alegria";
                break;
            case 3:
            case 6:
                this.msgMisterioDia = "Oração de hoje: Mistérios da Dor";
                break;
            case 4:
            case 1:
                this.msgMisterioDia = "Oração de hoje: Mistérios da Glória";
                break;
            case 5:
                this.msgMisterioDia = "Oração de hoje: Mistérios da Luz";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + diaHoje());
        }
        return getMsgMisterioDia();

    }

    /*Dias da Semana representado pelo sistema
        1=Domingo, 2=Segunda, 3=Terça, 4=Quarta, 5=Quinta, 6=sexta, 7=Sábado

        Mistérios
            Segunda/Sábados = Mistérios da Alegria (2-7)
            Terça/Sextas = Mistérios da Dor (3-6)
            Quarta/Domingos = Mistérios da Glória (4-1)
            Quintas-feiras = Mistérios da Luz (5)
        * */
    public String getMsgMisterioDia() {
        return msgMisterioDia;
    }

    public void setMsgMisterioDia(String msgMisterioDia) {
        this.msgMisterioDia = msgMisterioDia;
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
