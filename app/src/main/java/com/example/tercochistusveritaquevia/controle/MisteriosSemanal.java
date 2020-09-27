package com.example.tercochistusveritaquevia.controle;

import java.util.Calendar;

import static java.util.Calendar.DAY_OF_WEEK;

public class MisteriosSemanal extends ProgressoTerco {
    private String msgMisterioDia;
    private String tituloMt;
    private String subTituloMt;
    private String descricaoMt;

    public String misterioSemanaExibir() {

        Calendar cal = Calendar.getInstance();
        int diaHoje = cal.get(DAY_OF_WEEK);
        switch (diaHoje) {
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
                throw new IllegalStateException("Unexpected value: " + diaHoje);
        }
        return getMsgMisterioDia();

    }

    public String getMsgMisterioDia() {
        return msgMisterioDia;
    }

    public void setMsgMisterioDia(String msgMisterioDia) {
        this.msgMisterioDia = msgMisterioDia;
    }

    public String getTituloMt() {
        return tituloMt;
    }

    public void setTituloMt(String tituloMt) {
        this.tituloMt = tituloMt;
    }

    public String getSubTituloMt() {
        return subTituloMt;
    }

    public void setSubTituloMt(String subTituloMt) {
        this.subTituloMt = subTituloMt;
    }

    public String getDescricaoMt() {
        return descricaoMt;
    }

    public void setDescricaoMt(String descricaoMt) {
        this.descricaoMt = descricaoMt;
    }
}






