package atividades.Telefonia;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public enum TipoTelefonico {

    TELEFONE_FIXO("####-####", 8),
    TELEFONE_FIXO_DDD("(##)####-####", 10),
    CELULAR("#####-####", 9),
    CELULAR_DDD("(##)#####-####", 11);

    private final String formato;

    private final Integer tamanho;



    TipoTelefonico(String formato, Integer tamanho){
        this.formato = formato;
        this.tamanho = tamanho;

    }

    public String getFormato() {
        return formato;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public String getNumeroFormatado(String numeroTelefonico) throws ParseException {
        MaskFormatter mf = new MaskFormatter(this.getFormato());
        mf.setValueContainsLiteralCharacters(false);
        return mf.valueToString(numeroTelefonico);
    }
}