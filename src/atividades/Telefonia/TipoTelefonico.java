package atividades.Telefonia;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public enum TipoTelefonico {

    TELEFONE_FIXO("####-####", 8, "TELEFONE FIXO"),
    TELEFONE_FIXO_DDD("(##)####-####", 10, "TELEFONE FIXO COM DDD ggggg"),
    CELULAR("#####-####", 9, "CELULAR"),
    CELULAR_DDD("(##)#####-####", 11, "CELULAR COM DDD");

    private final String formato;

    private final Integer tamanho;

    private final String tipo;



    TipoTelefonico(String formato, Integer tamanho, String tipo){
        this.formato = formato;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public String getFormato() {
        return formato;
    }

    public String getTipo(){
        return tipo;
    }

    public String getNumeroFormatado(String numeroTelefonico) throws ParseException {
        MaskFormatter mf = new MaskFormatter(this.getFormato());
        mf.setValueContainsLiteralCharacters(false);
        return mf.valueToString(numeroTelefonico);
    }
}