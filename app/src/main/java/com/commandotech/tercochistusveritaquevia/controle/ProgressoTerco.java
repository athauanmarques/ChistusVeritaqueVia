package com.commandotech.tercochistusveritaquevia.controle;

import com.commandotech.tercochistusveritaquevia.R;

import java.util.Calendar;

import static java.util.Calendar.DAY_OF_WEEK;

public class ProgressoTerco{
    private static int posicaoTercoAtual = 0;
    private static boolean tercoVirtual;
    private int contador = 0;

    public int contarTerco(){

            setContador(1);
            setPosicaoTercoAtual(getContador());

        return getContador();
        
    }

    public void zerarTerco(){
        this.contador = 0;
        setPosicaoTercoAtual(getContador());
    }

    public int diaHoje(){
        Calendar cal = Calendar.getInstance();
        int dia = cal.get(DAY_OF_WEEK);
        return  dia;
    }


    /*Dias da Semana representado pelo sistema
        1=Domingo, 2=Segunda, 3=Terça, 4=Quarta, 5=Quinta, 6=sexta, 7=Sábado

        Mistérios
            Segunda/Sábados = Mistérios da Alegria (2-7)
            Terça/Sextas = Mistérios da Dor (3-6)
            Quarta/Domingos = Mistérios da Glória (4-1)
            Quintas-feiras = Mistérios da Luz (5)
        * */

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
