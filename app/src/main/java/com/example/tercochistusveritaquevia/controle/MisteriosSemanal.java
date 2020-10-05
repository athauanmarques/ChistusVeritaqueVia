package com.example.tercochistusveritaquevia.controle;

import com.example.tercochistusveritaquevia.R;

import java.util.Calendar;

import static java.util.Calendar.DAY_OF_WEEK;

public class MisteriosSemanal extends ProgressoTerco{
    private String msgMisterioDia;
    private int tituloMt;
    private int subTituloMt;
    private int imagemMt;
    private int descricaoMt;

    public int diaHoje(){
        Calendar cal = Calendar.getInstance();
        int dia = cal.get(DAY_OF_WEEK);
        return  dia;
    }

    public void atribuirTextos(){
        switch (diaHoje()) {
            case 2:
            case 7:
                if(getPosicaoTercoAtual() == 5 || getPosicaoTercoAtual() <= 5){
                    setTituloMt(R.string.tituloMt1);
                    setSubTituloMt(R.string.subTituloMt1_Seg);
                    setImagemMt(R.drawable.segmt1);
                    setDescricaoMt(R.string.descricaoMt1_Seg);
                } else if(getPosicaoTercoAtual() ==18){
                    setTituloMt(R.string.tituloMt2);
                    setSubTituloMt(R.string.subTituloMt2_Seg);
                    // setImagemMt(R.drawable.segmt2);
                    setDescricaoMt(R.string.descricaoMt2_Seg);
                } else if(getPosicaoTercoAtual() == 31){
                    setTituloMt(R.string.tituloMt3);
                    setSubTituloMt(R.string.subTituloMt3_Seg);
                    // setImagemMt(R.drawable.segmt3);
                    setDescricaoMt(R.string.descricaoMt3_Seg);
                } else if(getPosicaoTercoAtual() == 44){
                    setTituloMt(R.string.tituloMt4);
                    setSubTituloMt(R.string.subTituloMt4_Seg);
                    // setImagemMt(R.drawable.segmt4);
                    setDescricaoMt(R.string.descricaoMt4_Seg);
                }else if(getPosicaoTercoAtual() == 57){
                    setTituloMt(R.string.tituloMt5);
                    setSubTituloMt(R.string.subTituloMt5_Seg);
                    // setImagemMt(R.drawable.segmt5);
                    setDescricaoMt(R.string.descricaoMt5_Seg);
                }

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

    public String getMsgMisterioDia() {
        return msgMisterioDia;
    }

    public void setMsgMisterioDia(String msgMisterioDia) {
        this.msgMisterioDia = msgMisterioDia;
    }

    public int getTituloMt() {
        return tituloMt;
    }

    public void setTituloMt(int tituloMt) {
        this.tituloMt = tituloMt;
    }

    public int getSubTituloMt() {
        return subTituloMt;
    }

    public void setSubTituloMt(int subTituloMt) {
        this.subTituloMt = subTituloMt;
    }

    public int getDescricaoMt() {
        return descricaoMt;
    }

    public void setDescricaoMt(int descricaoMt) {
        this.descricaoMt = descricaoMt;
    }

    public int getImagemMt() {
        return imagemMt;
    }

    public void setImagemMt(int imagemMt) {
        this.imagemMt = imagemMt;
    }
}

 /*Dias da Semana representado pelo sistema
        1=Domingo, 2=Segunda, 3=Terça, 4=Quarta, 5=Quinta, 6=sexta, 7=Sábado

        Mistérios
            Segunda/Sábados = Mistérios da Alegria (2-7)
            Terça/Sextas = Mistérios da Dor (3-6)
            Quarta/Domingos = Mistérios da Glória (4-1)
            Quintas-feiras = Mistérios da Luz (5)
        * */




